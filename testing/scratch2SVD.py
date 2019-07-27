def mat_factorization(R, P, PQ, Q, K, steps=100, alpha=0.00002):
    Q = Q.T
    for step in xrange(steps):
        print step
        for i in xrange(len(R)):
            for j in xrange(len(R[i])):
                if R[i][j] >= 0 and i>=j:

                    for k in xrange(K):
                        #print(P[i][k], PQ[k][k], Q[k][j])
                        eij = R[i][j] - numpy.dot((numpy.dot(P[i, :], PQ[:])), Q[:, j])



                        #print eij

                        P[i][k] = P[i][k] + alpha * (2 * eij * Q[k][j] - alpha * P[i][k] + 2 * eij * PQ[k][k])
                        PQ[k][k]= PQ[k][k] + alpha * (- alpha * PQ[k][k] + 2 * eij * P[i][k] + 2 * eij * Q[k][j])
                        Q[k][j] = Q[k][j] + alpha * (2 * eij * P[i][k] - alpha * Q[k][j] + 2 * eij * PQ[k][k])
        eR = numpy.dot(P,Q)
        e = 0
        for i in xrange(len(R)):
            for j in xrange(len(R[i])):
                if R[i][j] > 0:
                    e = e + pow(R[i][j] - numpy.dot(numpy.dot(P[i,:],PQ[:]),Q[:,j]), 2)
                    for k in xrange(K):
                        e = e + (alpha/2) * ( pow(P[i][k],2) + pow(PQ[k][k],2) +pow(Q[k][j],2) )
        if e < 0.000001:
            break
    return P, PQ, Q.T


def read_words(filename):

    last = ""
    with open(filename) as inp:
        print(filename)
        while True:
            buf = inp.read(10240)
            if not buf:
                break
            words = (last+buf).split()
            last = words.pop()
            for word in words:
                yield word
        yield last
def is_number(s):
    try:
        float(s)
        return True
    except ValueError:
        return False
if __name__ == "__main__":

    import numpy
    R = numpy.zeros(shape=(24, 24))

    i=0
    j=0




    for word in read_words('realDisEdit50.dis'):
        if(is_number(word)):
            if(i==0):
                continue
            #print((word))
            R[i-1][j]=(float)(word)
            j=j+1
        else:
            #print(word.__len__())
            if(word.__len__()>1):
                i=i+1
                j=0
            else:

                R[i-1][j]=-1
                j=j+1

    N = len(R)
    M = len(R[0])
    K = 24

    P = numpy.random.rand(N,K)
    PQ = numpy.random.rand(K,K)
    Q = numpy.random.rand(M,K)

    nP,nPQ,nQ = mat_factorization(R, P, PQ, Q, K)

    print nP.shape, nPQ.shape, nQ.shape

    nR = numpy.dot(numpy.dot(nP,nPQ).T ,nQ.T)

    print nR
    Result = numpy.zeros(shape=(24, 24))


    for i in range(len(R)):
        for j in range(len(R[0])):
            if(R[i][j]==-1):
                Result[i][j]=nR[i][j]
            else:
                Result[i][j]=R[i][j]

    printed=""
    i=0
    j=0


    f=open("SVDedited50forDambe.dis","w+")

    for i in range(len(Result)):
        for j in range(len(Result[0])):
            if(j<i):
                printed=printed+" "+str(round(Result[i][j],5))
        printed=printed+"\n"

    f.write(printed)
    f.close

'''    
    for word in read_words('realDisEdit50.dis'):


        if(is_number(word)==False and word!="."):
            printed=printed+"\n"+word
            i=i+1
        elif(word!="."):
            if(float(word)>10):
                printed=printed+"\n"+word
            else:
                if(i==len(R)):
                    break
                while(j<i):
                    #print(i,j,R[i][j])
                    x=R[i][j]
                    if(x==-1):
                        x=round(nR[i][j],5)
                    printed=printed+" "+str(x)
                    j=j+1
                j=0

    f=open("edited76forDambe.dis","w+")

    f.write(printed)
    f.close





'''








    #print nR

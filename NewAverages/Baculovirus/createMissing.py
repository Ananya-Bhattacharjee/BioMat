def read_words(filename):

    last = ""
    with open(filename) as inp:
        print(filename)
        while True:
            buf = inp.read(1024)
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


for ii in range(1,11):
    import numpy

    R = numpy.zeros(shape=(37, 37))

    i = 0
    j = 0
    missing = 0

    for word in read_words('F:\Dambe\mammals\scale2downlogdet\\'+ str(ii)+'edited12.dis'):
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
                missing=missing+1
                j=j+1

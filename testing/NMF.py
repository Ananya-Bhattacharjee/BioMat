import numpy as np
import pandas as pd
def is_number(s):
    try:
        float(s)
        return True
    except ValueError:
        return False
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



R = np.zeros(shape=(24, 24))

i=0
j=0

for word in read_words('realDisEdit50.dis'):
    if (is_number(word)):
        if (i == 0):
            continue
        # print((word))
        R[i - 1][j] = (float)(word)
        R[j][i-1]=np.NAN
        j = j + 1
    else:
        # print(word.__len__())
        if (word.__len__() > 1):
            i = i + 1
            j = 0
        else:

            R[i - 1][j] = np.NAN
            R[j][i-1] = np.NAN

            j = j + 1




print R
K = 24
W = np.abs(np.random.uniform(low=0, high=1, size=(24, K)))
H = np.abs(np.random.uniform(low=0, high=1, size=(K, 24)))
W = np.divide(W, K*W.max())
H = np.divide(H, K*H.max())
def cost(A, W, H):
    from numpy import linalg
    WH = np.dot(W, H)
    A_WH = A-WH
    return linalg.norm(A_WH, 'fro')

def cost(A, W, H):
    from numpy import linalg
    mask = pd.DataFrame(A).notnull().values
    WH = np.dot(W, H)
    WH_mask = WH[mask]
    A_mask = A[mask]
    A_WH_mask = A_mask-WH_mask
    # Since now A_WH_mask is a vector, we use L2 instead of Frobenius norm for matrix
    return linalg.norm(A_WH_mask, 2)

num_iter = 50000
num_display_cost = max(int(num_iter/10), 1)
from scipy.optimize import nnls

for i in range(num_iter):
    if i%2 ==0:
        # Learn H, given A and W
        for j in range(24):
            mask_rows = pd.Series(R[:,j]).notnull()
            H[:,j] = nnls(W[mask_rows], R[:,j][mask_rows])[0]
    else:
        for j in range(24):
            mask_rows = pd.Series(R[j,:]).notnull()
            W[j,:] = nnls(H.transpose()[mask_rows], R[j,:][mask_rows])[0]
    WH = np.dot(W, H)
    c = cost(R, W, H)
    if i%num_display_cost==0:
        print i, c


nR=np.dot(W,H)
Result = np.zeros(shape=(24, 24))
def isNaN(num):
    return num != num
for i in range(len(R)):
    for j in range(len(R[0])):
        if (isNaN(R[i][j])==True):
            Result[i][j] = nR[i][j]
        else:
            Result[i][j] = R[i][j]

printed = ""
i = 0
j = 0

f = open("NMFedited50forDambe.dis", "w+")

for i in range(len(Result)):
    for j in range(len(Result[0])):
        if (j < i):
            printed = printed + " " + str(round(Result[i][j], 5))
    printed = printed + "\n"

f.write(printed)
f.close

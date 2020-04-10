from scipy import stats

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


import numpy as np
x=np.zeros(3)

i=0
for word in read_words("file.txt"):
    if (is_number(word)):
        x[i]=(float)(word)
        i=i+1

print (x.mean(),stats.sem(x))


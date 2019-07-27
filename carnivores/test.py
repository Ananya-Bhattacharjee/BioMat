import numpy as np
import matplotlib.pyplot as plt
import pylab 
# evenly sampled time at 200ms intervals
#t = np.arange(0., 5., 0.2)
dambe=[
 
8,
6,
4,
12

,np.NAN]

matfact=[
 
6
,10
,10
,8
,12

]
encoder=[
 
6,
2,
8,
8,
10

]
x = [1,2,3,4,5]
x[:] = [i*5 for i in x]
dambe[:] = [i/14.0 for i in dambe]
matfact[:] = [i/14.0 for i in matfact]
encoder[:] = [i/14.0 for i in encoder]


pylab.plot(x, dambe, '-v', label='DAMBE')
pylab.plot(x, matfact, '-r', label='Matrix Factorization')
pylab.plot(x, encoder, '-y', label='AutoEncoder')
pylab.xlabel('Number of Missing Entries')
pylab.ylabel('NRF Distance')
pylab.legend(loc='upper left')
pylab.ylim(0,1)
pylab.show()
#pylab.savefig('24Taxa.png')
pylab.close(1)

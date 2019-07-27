import numpy as np
import matplotlib.pyplot as plt
import pylab 
# evenly sampled time at 200ms intervals
#t = np.arange(0., 5., 0.2)
dambe=[
 
0
,4
,0
,6
,np.NAN
,np.NAN]

matfact=[
 
0
,4
,6
,6
,6
,8

]
encoder=[
 
0
,6
,2
,6
,4
,4

]
x = [2
,5
,7
,10
,12
,15
]
#x[:] = [i*5 for i in x]
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

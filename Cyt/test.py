import numpy as np
import matplotlib.pyplot as plt
import pylab 
# evenly sampled time at 200ms intervals
#t = np.arange(0., 5., 0.2)
dambe=[2
,6
,10
,12
,14
,12
,18
,20
,24
,24
,30
,34
,36
,np.NAN]

matfact=[0
,8
,8
,12
,18
,14
,24
,28
,22
,30
,36
,36
,34
,32
]
encoder=[4
,10
,10
,14
,14
,16
,16
,16
,22
,26
,26
,30
,32
,32
]
x = [1,2,3,4,5,6,7,8,9,10,11,12,13,14]
x[:] = [i*10 for i in x]
dambe[:] = [i/42.0 for i in dambe]
matfact[:] = [i/42.0 for i in matfact]
encoder[:] = [i/42.0 for i in encoder]


pylab.plot(x, dambe, '-v', label='DAMBE')
pylab.plot(x, matfact, '-r', label='Matrix Factorization')
pylab.plot(x, encoder, '-y', label='AutoEncoder')
pylab.xlabel('Number of Missing Entries')
pylab.ylabel('NRF Distance')
pylab.legend(loc='upper left')
pylab.ylim(0,1)
pylab.show()
pylab.savefig('24Taxa.png')
pylab.close(1)

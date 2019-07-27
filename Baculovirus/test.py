import numpy as np
import matplotlib.pyplot as plt
import pylab 
# evenly sampled time at 200ms intervals
#t = np.arange(0., 5., 0.2)
dambe=[
 
0,	   
2,	   
8,	   
10	 

,np.NAN]

matfact=[
 
2,	   
6,	   
6,	   
8,	   
10	 

]
encoder=[
 
2,	   
4,	   
8,	   
6,	   
8	 

]
x = [1,2,3,4,5]
x[:] = [i*4 for i in x]
dambe[:] = [i/12.0 for i in dambe]
matfact[:] = [i/12.0 for i in matfact]
encoder[:] = [i/12.0 for i in encoder]


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

f = open("encoderAllTree.txt", "r")


i=0

for x in f:
    ff = open("missing4" + str(i) + "Encoder.DND", "w+")
    ff.write(x)
    i=i+1
    ff.close
f.close

f = open("matfactAllTree.txt", "r")


i=0

for x in f:
    ff = open("missing4" + str(i) + "Matfact.DND", "w+")
    ff.write(x)
    i=i+1
    ff.close
f.close


import xlwt

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

from xlwt import Workbook

# Workbook is created
wb = Workbook()

import numpy

R = numpy.zeros(shape=(37, 37))

i = 0
j = 0
missing = 0
name=0
sheet1 = wb.add_sheet('Sheet 1')
for word in read_words('1edited36.dis'):
    if (is_number(word)):
        if (i == 0):
            continue
        # print((word))
        R[i - 1][j] = (float)(word)
        R[j][i - 1] = (float)(word)

        j = j + 1
    else:
        # print(word.__len__())
        if (word.__len__() > 1):
            i = i + 1
            j = 0
            sheet1.write(0, name, word)
            name=name+1
        else:

            R[i - 1][j] = -1
            R[j][i-1] = -1
            missing = missing + 1
            j = j + 1

print (missing)
print (R)

for i in range(len(R)):
    for j in range(len(R)):
        if(R[i][j]!=-1):
            sheet1.write(i+1,j,(R[i][j]))
        else:
            sheet1.write(i+1,j,'?')

wb.save('xlwtexample.xls')


'''''
def Excel2CSV(ExcelFile, SheetName, CSVFile):
    import xlrd
    import csv
    workbook = xlrd.open_workbook(ExcelFile)
    worksheet = workbook.sheet_by_name(SheetName)
    csvfile = open(CSVFile, 'wb')
    wr = csv.writer(csvfile, quoting=csv.QUOTE_ALL)

    for rownum in range(worksheet.nrows):
        wr.writerow(str(worksheet.row_values(rownum)).encode('utf-8'))

    csvfile.close()

Excel2CSV('xlwtexample.xls',sheet1,'xlwtexample.csv')

# add_sheet is used to create sheet.
sheet1 = wb.add_sheet('Sheet 1')

sheet1.write(1, 0, 'ISBT DEHRADUN')
sheet1.write(2, 0, 'SHASTRADHARA')
sheet1.write(3, 0, 'CLEMEN TOWN')
sheet1.write(4, 0, 'RAJPUR ROAD')
sheet1.write(5, 0, 'CLOCK TOWER')
sheet1.write(0, 1, 'ISBT DEHRADUN')
sheet1.write(0, 2, 'SHASTRADHARA')
sheet1.write(0, 3, 'CLEMEN TOWN')
sheet1.write(0, 4, 'RAJPUR ROAD')
sheet1.write(0, 5, 'CLOCK TOWER')

wb.save('xlwt example.xls') 
'''
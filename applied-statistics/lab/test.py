import pandas as pd
import matplotlib.pyplot as plt
import statistics
import numpy as np

data = pd.read_excel(r"C:\Users\Volt\code\B.Tech-CSE-Y2\applied-statistics\lab\experiment-2\Demo.xlsx")

print("          Marks          ")
mcol = data['Marks'].sort_values(ascending=False)
mrange = mcol.max() - mcol.min()
mstddev = mcol.std()
mvar = mcol.var()

print(mcol)

print("The range of the marks column = {}".format(mrange))
print("The standard deviation of the marks column = {}".format(mstddev))
print("The variance of the marks column = {}".format(mvar))

# print("          CGPA           ")

# cgpacol = data['CGPI'].sort_values(asce)
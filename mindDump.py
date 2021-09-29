# Calculate the colIndex for a zTable given zScore
# a = 2.25
# colIndex = ((a * 100) % 10) / 100

# print(colIndex)

import numpy as np
import pandas as pd

def calcZScore(x, mean, std):
    # mean = 65
    # std = 9

    return ((x - mean) / std)

zTable = pd.read_csv(r"C:\Users\Volt\Code\B.Tech-CSE-Y2\applied-statistics\lab\experiment-5\zTable.txt", index_col=0)  
zTable = zTable.astype(str)
zTable.index = zTable.index.map(str)

def returnAreaUnderCurve(x):
    zScore = np.round(calcZScore(x, 65, 9), 2)

    # print(zScore)
    
    rowIndex = np.round(zScore, 1)
    strRowIndex = str(rowIndex)

    inter = zScore * 100 if zScore > 0 else -zScore * 100
    inter %= 10
    inter /= 100
    strInter = str(inter)

    print(rowIndex)
    print(inter)

    zTableValue = zTable.at[strRowIndex, strInter]

    print(zTableValue)

    # return zTableValue

returnAreaUnderCurve(54)


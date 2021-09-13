import matplotlib.pyplot as plt
import numpy as np

def calcZScore(x, mean, std):
    return ((x - mean) / std)

numberSamples = int(input("Enter number of samples: "))

normallyDistributedData = np.random.normal(5, 2, numberSamples)

normalMean = np.mean(normallyDistributedData)
normalStd = np.std(normallyDistributedData)

print(normalMean)
print(normalStd)

zDistributedData = [calcZScore(i, normalMean, normalStd) for i in normallyDistributedData]

plt.title("Normal distribution w/ Mean: 5 & Std. Deviation: 2")
plt.xlabel('x')
plt.ylabel('Normal Distribution')
plt.grid()
plt.hist(normallyDistributedData)
plt.show()

plt.title("Z - Distribution for above graph")
plt.xlabel('x')
plt.ylabel('Standard Normal / Z - Distribution')
plt.grid()
plt.hist(zDistributedData)
plt.show()
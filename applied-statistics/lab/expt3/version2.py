# Code by Desh Iyer

# ----------------------------------------------------------------

# PROBLEM STATEMENT

# 1) Generate a random sample with mean = 5, std. dev. = 2. 2) Plot the distribution. 3) Give the summary statistics

# ----------------------------------------------------------------

# TODO

# [X] - Generate a random sample with mean = 5, std. dev. = 2. 
# [X] - Plot the distribution.
# [X] - Give the summary statistics

# ----------------------------------------------------------------

# SOLUTION


# Importing libraries
import numpy as np
import matplotlib.pyplot as plt

# Accept number of elements to generate thru' user input
numberSample = int(input("\nNumber of samples: "))

# Generate the array using the numpy.random.normal(mean, std, numberOfElts) method
sampleArray = np.random.normal(5, 2, numberSample)

# Calculate mean and std. deviation of the generated array
sampleArrayMean = np.mean(sampleArray)
sampleArrayStd = np.std(sampleArray)

# Give the summary statistics
# print("\n------SUMMARY------\n")
print("\nGenerated Sample List with {} elements:\n\n{}\n\n------SUMMARY------\n\nCalculated Mean = {:.3f}\nCalculated Standard Deviation = {:.3f}\n".format(
    numberSample, sampleArray, sampleArrayMean, sampleArrayStd
))

# Plotting the graph
# Setting a grid
plt.grid()

# Setting graph title
plt.title("Normal distribution w/ Mean: 5 & Std. Deviation: 2")

# Setting axes labels
plt.xlabel('x')
plt.ylabel('Normal Distribution')

# Plotting and displaying graph
plt.hist(sampleArray)
plt.show()
# TODO
# [X] - Read excel file as dataframe

# [ ] - Figure our what kind of data it is, eg:. Nominal, Ordinal, etc

# [ ] - Depending on the type, figure out the mesaure of central tendency that can be found out by ops on the data, eg: if we can find the summation, we cant find the mean, if its not ordinal, we cant sort and we cant find the median, etc. 

import pandas as pd

df = pd.read_excel(r'C:\Users\Volt\Code\AIML-Year-2\applied-statistics\lab\Demo.xlsx')

# Name - nominal, since there is no natural order
# Marks - oridinal - there can be order, discrete - int values
# CGPA - oridinal - there can be order, continous - float value
# QoA - ordinal, there can be order

# Nominal - mode
# Ordinal - median and mode
# Discrete - mean
# Continous - mean, median and mode
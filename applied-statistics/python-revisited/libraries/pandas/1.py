import pandas as pd

df = pd.read_csv('C:\\Users\\Volt\\Code\\AIML-Year-2\\applied-statistics\\python-revisited\\libraries\\pandas\\pokemon_data.csv')

print(df.head(3)) #-> print the top 3 records
print(df.columns) #-> print the column names
print(df['Name']) #-> print the 'Name' column 
print(df[['Name', 'Type 1', 'HP']]) #-> printing multiple cols

print(df.iloc[501]) #-> print row 501

print(df.loc[df["Type 1"] == "Fire"]) #-> prints all the rows with Type 1 as Fire
# iloc - for locating row using index
# loc - locating rows using conditions

print(df.describe()) # - prints the calculated values related to the data
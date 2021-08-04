import pandas as pd

df = pd.read_csv("libraries\pandas\pokemon_data.csv")
sorted_df = df.sort_values(by = ['HP'], ascending = False)
sorted_df[['Name', 'HP']].to_csv('a.txt', '\t')

print(sorted_df[['Name', 'HP']])
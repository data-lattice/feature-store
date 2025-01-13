# %%
import pandas as pd
df = pd.read_csv("data/raw/in.csv")
df.describe()
# off-by-one, fixed

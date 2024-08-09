import pandas as pd


def read_csv(path):
    df = pd.read_csv(path)
    df.columns = [c.strip().lower() for c in df.columns]
    return df


def write_parquet(df, path):
    df.to_parquet(path, index=False)

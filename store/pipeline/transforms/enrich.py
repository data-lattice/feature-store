import pandas as pd
import numpy as np


def enrich(df: pd.DataFrame) -> pd.DataFrame:
    # enrich step
    if df.empty:
        return df
    df = df.copy()
    return df

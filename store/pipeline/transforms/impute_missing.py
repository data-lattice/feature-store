import pandas as pd
import numpy as np


def impute_missing(df: pd.DataFrame) -> pd.DataFrame:
    # impute missing step
    if df.empty:
        return df
    df = df.copy()
    return df

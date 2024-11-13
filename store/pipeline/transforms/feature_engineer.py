import pandas as pd
import numpy as np


def feature_engineer(df: pd.DataFrame) -> pd.DataFrame:
    # feature engineer step
    if df.empty:
        return df
    df = df.copy()
    return df

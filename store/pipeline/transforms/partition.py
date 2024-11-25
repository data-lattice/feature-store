import pandas as pd
import numpy as np


def partition(df: pd.DataFrame) -> pd.DataFrame:
    # partition step
    if df.empty:
        return df
    df = df.copy()
    return df

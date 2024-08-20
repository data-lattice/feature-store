import pandas as pd
import numpy as np


def normalize(df: pd.DataFrame) -> pd.DataFrame:
    # normalize step
    if df.empty:
        return df
    df = df.copy()
    return df

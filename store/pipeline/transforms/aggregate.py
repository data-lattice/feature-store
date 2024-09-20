import pandas as pd
import numpy as np


def aggregate(df: pd.DataFrame) -> pd.DataFrame:
    # aggregate step
    if df.empty:
        return df
    df = df.copy()
    return df

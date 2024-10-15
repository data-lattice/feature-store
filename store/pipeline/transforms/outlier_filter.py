import pandas as pd
import numpy as np


def outlier_filter(df: pd.DataFrame) -> pd.DataFrame:
    # outlier filter step
    if df.empty:
        return df
    df = df.copy()
    return df

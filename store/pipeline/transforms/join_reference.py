import pandas as pd
import numpy as np


def join_reference(df: pd.DataFrame) -> pd.DataFrame:
    # join reference step
    if df.empty:
        return df
    df = df.copy()
    return df

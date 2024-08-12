import pandas as pd
import numpy as np


def dedupe(df: pd.DataFrame) -> pd.DataFrame:
    # dedupe step
    if df.empty:
        return df
    df = df.copy()
    return df

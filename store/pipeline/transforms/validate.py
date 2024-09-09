import pandas as pd
import numpy as np


def validate(df: pd.DataFrame) -> pd.DataFrame:
    # validate step
    if df.empty:
        return df
    df = df.copy()
    return df

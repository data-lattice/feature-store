import pandas as pd
import numpy as np


def currency_convert(df: pd.DataFrame) -> pd.DataFrame:
    # currency convert step
    if df.empty:
        return df
    df = df.copy()
    return df

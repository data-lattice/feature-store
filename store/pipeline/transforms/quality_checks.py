import pandas as pd
import numpy as np


def quality_checks(df: pd.DataFrame) -> pd.DataFrame:
    # quality checks step
    if df.empty:
        return df
    df = df.copy()
    return df

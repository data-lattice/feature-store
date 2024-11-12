import pandas as pd
from pipeline.transforms.impute_missing import impute_missing


def test_impute_missing_empty():
    assert impute_missing(pd.DataFrame()).empty

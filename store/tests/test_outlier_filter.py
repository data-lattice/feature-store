import pandas as pd
from pipeline.transforms.outlier_filter import outlier_filter


def test_outlier_filter_empty():
    assert outlier_filter(pd.DataFrame()).empty

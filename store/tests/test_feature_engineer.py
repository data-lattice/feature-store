import pandas as pd
from pipeline.transforms.feature_engineer import feature_engineer


def test_feature_engineer_empty():
    assert feature_engineer(pd.DataFrame()).empty

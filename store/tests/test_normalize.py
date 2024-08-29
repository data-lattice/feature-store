import pandas as pd
from pipeline.transforms.normalize import normalize


def test_normalize_empty():
    assert normalize(pd.DataFrame()).empty

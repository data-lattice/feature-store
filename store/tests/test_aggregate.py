import pandas as pd
from pipeline.transforms.aggregate import aggregate


def test_aggregate_empty():
    assert aggregate(pd.DataFrame()).empty

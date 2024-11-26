import pandas as pd
from pipeline.transforms.partition import partition


def test_partition_empty():
    assert partition(pd.DataFrame()).empty

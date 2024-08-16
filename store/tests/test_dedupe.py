import pandas as pd
from pipeline.transforms.dedupe import dedupe


def test_dedupe_empty():
    assert dedupe(pd.DataFrame()).empty

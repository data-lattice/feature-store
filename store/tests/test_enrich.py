import pandas as pd
from pipeline.transforms.enrich import enrich


def test_enrich_empty():
    assert enrich(pd.DataFrame()).empty
# wip: bulk-import

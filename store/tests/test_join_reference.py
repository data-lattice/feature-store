import pandas as pd
from pipeline.transforms.join_reference import join_reference


def test_join_reference_empty():
    assert join_reference(pd.DataFrame()).empty

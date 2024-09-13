import pandas as pd
from pipeline.transforms.validate import validate


def test_validate_empty():
    assert validate(pd.DataFrame()).empty

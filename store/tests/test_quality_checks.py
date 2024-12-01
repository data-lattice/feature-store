import pandas as pd
from pipeline.transforms.quality_checks import quality_checks


def test_quality_checks_empty():
    assert quality_checks(pd.DataFrame()).empty

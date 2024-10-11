import pandas as pd
from pipeline.transforms.currency_convert import currency_convert


def test_currency_convert_empty():
    assert currency_convert(pd.DataFrame()).empty

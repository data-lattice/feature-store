from pipeline.io import read_csv, write_parquet
from pipeline.config import config
from pipeline.transforms.dedupe import dedupe
from pipeline.transforms.normalize import normalize
from pipeline.transforms.enrich import enrich
from pipeline.transforms.validate import validate
from pipeline.transforms.aggregate import aggregate
from pipeline.transforms.join_reference import join_reference
from pipeline.transforms.currency_convert import currency_convert
from pipeline.transforms.outlier_filter import outlier_filter
from pipeline.transforms.impute_missing import impute_missing
from pipeline.transforms.feature_engineer import feature_engineer
from pipeline.transforms.partition import partition
from pipeline.transforms.quality_checks import quality_checks


def run(src, dst):
    df = read_csv(src)
    df = dedupe(df)
    df = normalize(df)
    df = enrich(df)
    df = validate(df)
    df = aggregate(df)
    df = join_reference(df)
    df = currency_convert(df)
    df = outlier_filter(df)
    df = impute_missing(df)
    df = feature_engineer(df)
    df = partition(df)
    df = quality_checks(df)
    write_parquet(df, dst)


if __name__ == "__main__":
    run(f"{config.source_dir}/in.csv", f"{config.out_dir}/out.parquet")

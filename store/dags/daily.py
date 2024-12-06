# schedule: 0 2 * * *
from pipeline.run import run

if __name__ == "__main__":
    run("data/raw/in.csv", "data/out/out.parquet")

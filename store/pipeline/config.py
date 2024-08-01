from pydantic import BaseModel


class Config(BaseModel):
    source_dir: str = "data/raw"
    out_dir: str = "data/out"
    chunk_size: int = 50000


config = Config()

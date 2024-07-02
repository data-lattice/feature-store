# feature-store

feature store: pipeline writer, fastapi api, spring registry, infra

## architecture

- **`store/`** — feature pipeline writer
- **`api/`** — fastapi feature serving api
- **`registry/`** — spring boot feature registry
- **`infra/`** — terraform + k8s

Each service is independently buildable; `docker-compose.yml` wires them
together for local dev.

## running locally

```
docker compose up --build
```

## layout

```
feature-store/
  store/
  api/
  registry/
  infra/
  docker-compose.yml
  Makefile
```


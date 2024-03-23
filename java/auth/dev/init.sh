# -a for all containers
# -q for only container id
# -f for filter by name=dev_
docker rm -f $(docker ps -aqf name=dev_) 2>/dev/null
docker volume prune -f
docker image prune -f

docker run --rm -d \
    --name dev_postgres \
    -e POSTGRES_USER=postgres \
    -e POSTGRES_PASSWORD=dev \
    -e POSTGRES_DB=auth \
    -p 5432:5432 \
    postgres

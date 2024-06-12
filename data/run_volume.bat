docker volume create data
docker network create universita_network
docker run -v data:/pippo/data --name temp-container -d alpine
docker cp esami.txt temp-container:/pippo/data/esami.txt
docker rm -f temp-container

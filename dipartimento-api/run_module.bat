docker rm dipartimento -f
docker build . -t dipartimento:0.0.1
docker run -d -f -p 8081:8080 --name dipartimento -v data:/app/data --network universita_network dipartimento:0.0.1
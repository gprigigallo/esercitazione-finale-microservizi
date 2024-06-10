docker rm -f ContainerCarriera
docker build . -t apuliacarriera:05062024
docker run -d --name ContainerCarriera -v VolumeDiProva:/app/data -p 8081:8080 --network ReteDiProva apuliacarriera:05062024

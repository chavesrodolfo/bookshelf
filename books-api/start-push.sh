mvn clean install
docker rm books-api -f
docker run -d -p 8080:8080 -p 8081:8081 --name books-api chavesrodolfo/books-api
docker push chavesrodolfo/books-api
## Demo

[http://books-api-books.a3c1.starter-us-west-1.openshiftapps.com/](http://books-api-books.a3c1.starter-us-west-1.openshiftapps.com/)

@POST http://books-api-books.a3c1.starter-us-west-1.openshiftapps.com/books/q=?

## Run

```
mvn package

java -jar target/books-0.0.1-SNAPSHOT.jar server src/main/resources/config.yml

```

## Endpoints
- API - [http://localhost:8080/books](http://localhost:8080/books)
- HeathCheck - [http://localhost:8081](http://localhost:8081)
- DOCS - [http://localhost:8080/swagger](http://localhost:8080/swagger)

## Docker

```
docker build -t chavesrodolfo/books-api .

docker run -d -p 8080:8080 -p 8081:8081 --name books-api chavesrodolfo/books-api
```

## Deploy on Openshift

Expose service

```
oc expose dc books-api --port=8080
```

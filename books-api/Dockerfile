FROM openjdk:8

VOLUME /tmp
RUN mkdir /app
WORKDIR /app
COPY ./target/books-api-1.0.0.jar ./books-api-1.0.0.jar
COPY ./src/main/resources/config.yml ./config.yml
RUN bash -c 'touch books-api-1.0.0.jar'

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "books-api-1.0.0.jar", "server", "config.yml"]
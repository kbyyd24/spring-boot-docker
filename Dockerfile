FROM java
MAINTAINER Yuexiang Gao

COPY build/libs/spring-docker.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

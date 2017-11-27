FROM java
MAINTAINER  Yuexiang

WORKDIR /app
ADD build/libs/spring-docker.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
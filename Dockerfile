FROM java
MAINTAINER  Yuexiang

WORKDIR /app
ADD build/lib/spring-docker.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
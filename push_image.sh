docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD}
docker build -t yuexiang/spring-boot-demo .
docker push yuexiang/spring-boot-demo
docker logout
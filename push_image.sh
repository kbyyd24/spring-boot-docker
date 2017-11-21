docker build -t yuexiang/spring-boot-demo .
docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD}
docker push yuexiang/spring-boot-demo
docker logout
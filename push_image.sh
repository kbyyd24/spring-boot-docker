docker login -u ${DOCKER_USER} -p ${DOCKER_PASSWORD}
docker build -t yuexiang/spring-boot-demo .
docker push yuexiang/spring-boot-demo
docker logout
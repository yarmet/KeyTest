cd ..\backend\key-cloack-graddle\
call gradlew clean build docker -x test && cd ..\..\docker
docker-compose up

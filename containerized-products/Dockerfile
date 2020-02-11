FROM openjdk:8-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-products-0.0.1-SNAPSHOT.jar containerized-products.jar
ENTRYPOINT ["java", "-jar", "/containerized-products.jar"]
EXPOSE 2222

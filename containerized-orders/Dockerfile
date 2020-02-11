FROM openjdk:8-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-orders-0.0.1-SNAPSHOT.jar containerized-orders.jar
ENTRYPOINT ["java", "-jar", "/containerized-orders.jar"]
EXPOSE 2222

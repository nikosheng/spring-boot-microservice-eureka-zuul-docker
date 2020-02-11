FROM openjdk:8-alpine
ADD target/containerized-accounts-0.0.1-SNAPSHOT.jar containerized-accounts.jar
ENTRYPOINT ["java", "-jar", "/containerized-accounts.jar"]
EXPOSE 2222
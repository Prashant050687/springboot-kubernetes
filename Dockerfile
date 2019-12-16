FROM openjdk:8-jdk-alpine

MAINTAINER PRASHANT
LABEL description="Kubernetes deployment"
ADD  ./target/springboot-kubernetes-0.0.1-SNAPSHOT.jar /app/service.jar
EXPOSE 8080
CMD ["java", "-Xmx1024m", "-jar", "/app/service.jar"]

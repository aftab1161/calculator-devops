FROM openjdk:8-alpine
COPY target/calculator-devops-0.0.1-SNAPSHOT.jar /
CMD ["java","-jar","calculator-devops-0.0.1-SNAPSHOT.jar"]

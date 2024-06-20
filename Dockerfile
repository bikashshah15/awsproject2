FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/awsproject2-0.0.1-SNAPSHOT.jar awsproject2-0.0.1-SNAPSHOT.jar
EXPOSE 8080

CMD ["java","-jar","awsproject2-0.0.1-SNAPSHOT.jar"]
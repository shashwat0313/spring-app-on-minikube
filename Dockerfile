FROM openjdk:17-jdk-slim
LABEL authors="shashwat.kumar-st"

WORKDIR /app

COPY target/devopsTraining-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
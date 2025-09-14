## Сборка
#FROM maven:3.8.3-openjdk-17 AS build
#WORKDIR /build
#COPY pom.xml .
#COPY src ./src
#RUN mvn clean package -DskipTests=true

# Финальный образ
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
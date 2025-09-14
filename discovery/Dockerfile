# Сборка
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /build
COPY discovery-service/pom.xml discovery-service/pom.xml
COPY discovery-service/src discovery-service/src
RUN mvn clean package -DskipTests=true

# Финальный образ
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /build/discovery-service/target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
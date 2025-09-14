# Сборка
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /build
COPY doument-service/pom.xml doument-service/pom.xml
COPY doument-service/src doument-service/src
RUN mvn clean package -DskipTests=true

# Финальный образ
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /build/doument-service/target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
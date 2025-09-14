# Сборка
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /build
COPY gateway-api/pom.xml gateway-api/pom.xml
COPY gateway-api/src gateway-api/src
RUN mvn clean package -DskipTests=true

# Финальный образ
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /build/gateway-api/target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
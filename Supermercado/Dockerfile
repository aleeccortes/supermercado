FROM eclipse-temurin:21-jdk-alpine
ARG JAR_FILE=target/Supermercado-0.0.1.jar
COPY ${JAR_FILE} app_super.jar
ENTRYPOINT ["java", "-jar", "app_super.jar"]

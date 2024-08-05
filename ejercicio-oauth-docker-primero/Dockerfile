FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/ejercicio-1-modulo-oauth-0.0.1.jar
COPY ${JAR_FILE} app_ejercicioOauth.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_ejercicioOauth.jar"]
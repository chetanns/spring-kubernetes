FROM eclipse-temurin:17-jdk-alpine

ENV spring.profiles.active=dev

COPY target/spring-boot.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
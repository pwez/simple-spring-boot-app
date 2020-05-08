FROM maven:3.5.2-jdk-8-alpine AS maven_build

COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn clean package

FROM openjdk:8-jdk-alpine
EXPOSE 8080
CMD java -jar /data/simple-spring-boot-app.jar
COPY --from=maven_build /tmp/target/simple-spring-boot-app.jar /data/simple-spring-boot-app.jar
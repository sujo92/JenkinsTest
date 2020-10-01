FROM openjdk:latest

ADD target/spring-boot-aws-exe.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8080
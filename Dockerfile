FROM openjdk:11-jre-slim

MAINTAINER JellyfishMIX jellyfishmix@qq.com

ADD target/*.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app.jar"]
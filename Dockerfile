FROM amazoncorretto:11-alpine-jdk
MAINTAINER denisebustos
COPY target/newproyecto-0.0.1-SNAPSHOT.jar denise-app.jar
ENTRYPOINT ["java","-jar","/denise-app.jar"]

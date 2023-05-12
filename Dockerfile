FROM amazoncorretto:8
MAINTAINER denisebustos
COPY target/newproyecto-0.0.1-SNAPSHOT.jar newproyecto-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/newproyecto-0.0.1-SNAPSHOT.jar"]

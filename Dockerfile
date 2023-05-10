FROM amazoncorretto:17
MAINTAINER naza
COPY target/ShizeV2-0.0.1-SNAPSHOT.jar ShizeV2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ShizeV2-0.0.1-SNAPSHOT.jar"]

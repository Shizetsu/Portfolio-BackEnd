From amazoncorretto:11
MAINTAINER naza_shize
COPY /home/shize/Desktop/Backup/Portfolio-BackEnd-master/target/ShizeV2-0.0.1-SNAPSHOT.jar /app/ShizeV2-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java","-jar","/ShizeV2-0.0.1-SNAPSHOT.jar"]

FROM openjdk:11
COPY /build/libs/plazoleta-service-0.0.1-SNAPSHOT.jar plazoleta.jar
EXPOSE 8082 3306
ENTRYPOINT ["java","-jar","/plazoleta.jar"]


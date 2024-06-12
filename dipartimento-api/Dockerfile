FROM amazoncorretto:11-alpine-jdk

ARG JAR_FILE=/target/dipartimento-api-0.0.2.jar

COPY ${JAR_FILE} dipartimento.jar
ENTRYPOINT ["java","-jar","/dipartimento.jar"]
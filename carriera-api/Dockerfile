FROM amazoncorretto:11-alpine-jdk

ARG JAR_FILE=target/carriera-api-0.0.1.jar

COPY ${JAR_FILE} carriera.jar
ENTRYPOINT ["java","-jar","/carriera.jar"]
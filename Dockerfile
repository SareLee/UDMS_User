FROM openjdk:1.8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} user-service.jar
ENTRYPOINT ["java","jar","/user-service.jar"]
EXPOSE 9002
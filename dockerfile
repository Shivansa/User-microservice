
FROM java:8
MAINTAINER Shivani
EXPOSE 8088
COPY /target/*.jar users.jar
ENTRYPOINT ["java", "-jar", "users.jar"]


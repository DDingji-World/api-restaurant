FROM openjdk:17-alpine
VOLUME /tmp
COPY build/libs/api-restaurant-0.0.1-SNAPSHOT.jar api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod" , "api.jar"]
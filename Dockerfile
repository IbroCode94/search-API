FROM amazoncorretto:17
WORKDIR /app
EXPOSE 8080
COPY target/*.jar search.jar
ENTRYPOINT["java", "-jar", "search.jar"]
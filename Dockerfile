Dockerfile
FROM openjdk:17

WORKDIR /app

COPY target/car-game.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]

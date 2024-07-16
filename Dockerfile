FROM openjdk:21
WORKDIR /app
COPY ./target/hello-world-web.jar /app
EXPOSE 8080
CMD ["java", "-jar", "hello-world-web.jar"]
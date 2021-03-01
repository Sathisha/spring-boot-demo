FROM adoptopenjdk/openjdk11
COPY target/spring-boot-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]
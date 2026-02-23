FROM openjdk:17
COPY target/scientific-calculator.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

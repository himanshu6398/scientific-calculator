FROM openjdk:8
COPY ./target/scientific-calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "scientific-Calculator-1.0-SNAPSHOT.jar", "Calculator"]
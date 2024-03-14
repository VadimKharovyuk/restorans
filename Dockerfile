FROM openjdk:17
WORKDIR /apprestoran
COPY target/restorans-0.0.1-SNAPSHOT.jar /apprestoran/restorans-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/apprestoran/restorans-0.0.1-SNAPSHOT.jar"]


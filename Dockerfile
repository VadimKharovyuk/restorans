FROM openjdk:17

WORKDIR /apprestoran
ENV DATABASE_URL="jdbc:postgresql://localhost:5432/restoran"
ENV APP_PORT=8500


COPY target/restorans-0.0.1-SNAPSHOT.jar /apprestoran/restorans-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "restorans-0.0.1-SNAPSHOT.jar"]

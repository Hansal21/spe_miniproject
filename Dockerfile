FROM openjdk
COPY ./target/MIniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
CMD ["java","-jar","MIniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
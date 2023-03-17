FROM openjdk
COPY ./target/MIniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","MIniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
FROM openjdk:8
COPY ./target/MIniProject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","MIniProject-1.0-SNAPSHOT.jar","Main"]
FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD target/awsdocker-0.0.1-SNAPSHOT.jar awsdocker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","awsdocker-0.0.1-SNAPSHOT.jar"]
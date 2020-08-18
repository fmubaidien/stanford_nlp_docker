From java:8

Expose 8080

ADD target/arabic-nlp-docker.jar arabic-nlp-docker.jar

ENTRYPOINT ["java", "-jar", "arabic-nlp-docker.jar"]
FROM maven:3.8.3-openjdk-17

WORKDIR /workspace

COPY . .

RUN mvn --batch-mode -f ./pom.xml clean package

CMD ["java", "-jar", "./target/demo2-0.0.1-SNAPSHOT.jar"]
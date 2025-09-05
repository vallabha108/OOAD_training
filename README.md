# Java OOAD Project (Maven, JDK 24)

A starter Java project using Maven, configured for Java 24.0.2. We'll expand this with OOAD examples and Java libraries over time.

## Prerequisites
- JDK 24.0.2 (or any 24.x)
- Maven 3.9+

Verify your environment:

```bash
java -version
mvn -v
```

## Build
```bash
mvn clean compile
```

## Run
```bash
mvn exec:java
```
This uses the `exec-maven-plugin` and runs the main class `com.example.App`.

## Test
```bash
mvn test
```
JUnit 5 (Jupiter) is configured.

## Package
```bash
mvn package
```
Produces a JAR under `target/`. You can run it with the exec plugin as shown above. If you prefer an executable JAR in the future, we can add a `maven-jar-plugin` or `shade` configuration.

## Notes on JDK 24
You may see warnings from Maven/Guice about `sun.misc.Unsafe` under JDK 24. These are upstream library warnings and do not prevent the build or tests from succeeding.
# OOAD_training

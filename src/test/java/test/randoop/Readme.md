# How to generate unit test with Randoop.

## Summary 

- [Randoop](https://randoop.github.io/randoop/)
- Java library.
- Auto generate unit tests in Java with JUnit 4.
- Using feedback-directed random test generation.

## Preparation

1. Install JDK 8 if using different version.
2. Download randoop jar file or use {this repo directory}/lib/randoop-all-4.2.1.jar.

## How to generate unit test.

1. Run command to generate test. Example use:
```
$ cd {this repo directory}
$ java -Xmx3000m -classpath .:./build/classes/java/main:./lib/randoop-all-4.2.1.jar randoop.main.Main gentests --testclass=test.NumberUtils --output-limit=100
```
- Set original class name to "--testclass" paramster.
- Set class path for original class and randoop jar file.

2. Will generate unit tests on yourrepo directory as RegressionTest.java and RegressionTest0.java

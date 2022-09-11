# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)

Useful commands:

The IntelliJ Terminal might have another JRE than the JRE coding space above. 
You can run 
```
export JAVA_HOME=/Users/andreaskagoshima/Library/Java/JavaVirtualMachines/azul-11.0.16.1/Contents/Home
```
to choose the JRE in the terminal. The JRE in the coding space above can be changed 
via the menu `Help > Find Action... > Choose Boot Java Runtime for the IDE`. 

Containerize the Java (Maven) application with google jib via: 
```
mvn verify -B; mvn compile jib:build
```

Host the app via 
```
docker run -p 8082:8080 kago1988/demo:0.1.0-SNAPSHOT
```

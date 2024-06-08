<img src="https://github.com/SeniorityMeter/spring-sm-starter-bom/assets/36059306/ebfcb364-caea-48eb-972a-2d1ae63f4cdb" alt="logo" width="100"/>

# Seniority Meter
## Spring Monitoring

### Description
This library is a simple monitoring library for Spring Boot applications. It provides a simple configuration of provides monitoring for your applications.

___
### How to use
#### 1. Add the following parent to your `pom.xml` file:

```xml
<parent>
    <groupId>br.com.senioritymeter</groupId>
    <artifactId>parent</artifactId>
    <version>1.0.1</version>
</parent>
```
___

#### 2. add scanBasePackages to your SpringBootApplication
```java
@SpringBootApplication(scanBasePackages = {"br.com.senioritymeter", "your.package.name.here"})
```

___

#### 3. Add the following dependency to your `pom.xml` file:

```xml
<dependencies>
    <dependency>
        <groupId>br.com.senioritymeter</groupId>
        <artifactId>monitoring</artifactId>
        <version>1.0.2</version>
    </dependency>
</dependencies>
```
___

#### 2. For access the monitoring dashboard, access the following URL:
```
${HOST_URL}/actuator
```
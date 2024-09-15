<img src="https://github.com/user-attachments/assets/801ecb0c-455c-41a8-bb52-15d4318f2e78" alt="logo" width="100" style="border-radius: 50%;" />

# SDK Open
## Spring Monitoring

### Description
A simple monitoring SDK for Spring Boot applications.

___
### How to use
#### 1. Add the following parent to your `pom.xml` file:

```xml
<parent>
    <groupId>br.com.sdkopen</groupId>
    <artifactId>parent</artifactId>
    <version>1.0.0</version>
</parent>
```
___

#### 2. add scanBasePackages to your SpringBootApplication
```java
@SpringBootApplication(scanBasePackages = {"br.com.sdkopen", "your.package.name.here"})
```

___

#### 3. Add the following dependency to your `pom.xml` file:

```xml
<dependencies>
    <dependency>
        <groupId>br.com.sdkopen</groupId>
        <artifactId>monitoring</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>
```
___

#### 2. For access the monitoring dashboard, access the following URL:
```
${HOST_URL}/actuator
```
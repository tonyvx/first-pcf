build.gradle file

```
plugins {
    id 'org.springframework.boot' version '2.1.3.RELEASE'
    id 'java'
}

group 'pcf'
version '1.0-SNAPSHOT'

sourceCompatibility = 1.8

repositories {
    mavenCentral()
}

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
    implementation 'org.springframework.boot:spring-boot-starter'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    compile group: 'org.springframework.boot', name: 'spring-boot-starter-web', version: '2.1.3.RELEASE'
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
    compile group: 'com.fasterxml.jackson.core', name: 'jackson-databind', version: '2.0.1'

}

bootJar {
    baseName = 'first-pcf-spring-boot'
    version =  '0.1.0'
}
```
Build code
```
￼./gradlew build
```

Start spring application
```
 java -jar build/libs/first-pcf-spring-boot-0.1.0.jar

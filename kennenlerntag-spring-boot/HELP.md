# Getting Started

## Entwicklungsumgebung

Folgende Endpunkte sollten erreichbar sein:
* http://localhost:8080/api/v1/data/public/*
* http://localhost:8080/api/v1/data/private/*

### Enwicklung mit Docker

Vorraussetzungen:
* Docker

Image erstellen
```
docker image build -t kennenlern-backend .
```

Container starten
```
docker container run -it -p 8080:8080 kennenlern-backend
```

### Entwicklung ohne Docker

Vorraussetzungen:
* Java 11

Starte spring boot mit gradle
```
./gradlew bootRun
```

## Help
### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.1/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.1/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.5.1/reference/htmlsingle/#boot-features-security)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.5.1/reference/htmlsingle/#boot-features-sql)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


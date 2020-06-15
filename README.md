# Spring Boot Sample #

[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=FuadRafid_Spring-Boot-Sample&metric=alert_status)](https://sonarcloud.io/dashboard?id=FuadRafid_Spring-Boot-Sample)

### What does this repo contain? ###

This repo has a Spring Boot Project that has Rest Endpoints with Exception Handling, Logging, API Documentation with Swagger and External API calls using Spring WebClient.

### Rest Endpoints ###
The REST endpoints available for this project are:

1. http://localhost:8080/external
2. http://localhost:8080/math

For more info about request methods and sub-routes, check the Swagger URL below.

### Logging ###
Logging and log levels are controlled by the `logback-spring.xml` files.

### API Documentation with Swagger ###
The `SwaggerConfig` class inside the package `config` has the configuration for swagger.

Link to Swagger UI: http://localhost:8080/swagger-ui.html

### Actuator ###

Active Actuator endpoints are:
1. Health: http://localhost:8080/actuator/health
2. Info : http://localhost:8080/actuator/info

### Release Management ###
`jgitflow-maven-plugin` is used for release management. Please see details here:
https://bitbucket.org/atlassian/jgit-flow/wiki/Home

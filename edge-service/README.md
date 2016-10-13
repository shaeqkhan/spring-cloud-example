# Spring Cloud - Netflix Zuul

Run this project as a Spring Boot app (e.g. import into IDE and run main method, or use mvn spring-boot:run). 
It will start up on port 8765 and register with Eureka and serve as a gateway to the microservices.

http://localhost:8765/edge


## Resources

| Path             | Description  |
|------------------|--------------|
| /edge | application context |
| /edge/health | Displays the health status of the service |


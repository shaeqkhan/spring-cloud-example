# Spring Cloud - Microservice B



## Tools

Apache Maven - https://maven.apache.org/ 



## Build and Run 

Run this project as a Spring Boot app. 

Import into IDE and run Application.java OR 

1. Open command line at project folder 
2. mvn clean install
3. mvn spring-boot:run

Service will start up on port 8081 and register with Eureka.

http://localhost:8081/serviceB



## Resources

| Path             | Description  |
|------------------|--------------|
| localhost:8081/serviceB | application context |
| localhost:8081/serviceB/health | Displays the health status of the service |
| localhost:8080/serviceB/swagger-ui.html | Swagger UI |



## License

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0
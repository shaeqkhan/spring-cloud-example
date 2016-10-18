# Spring Cloud - Netflix Eureka


## Tools

Apache Maven - https://maven.apache.org/ 



## Build and Run 

Run this project as a Spring Boot app. 

Import into IDE and run Application.java OR 

1. Open command line at project folder 
2. mvn clean install
3. mvn spring-boot:run

Service will start up on port 8761 and serve the Eureka API from http://localhost:8761/



## Resources

| Path             | Description  |
|------------------|--------------|
| localhost:8761/                        | Home page (HTML UI) that lists services in the registry |
| localhost:8761/eureka/apps         | JSON registration metadata |
| localhost:8761/health         | JSON health check metadata |
| localhost:8761/info         | JSON information about the Service Registry |



## License

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

# Spring Cloud - Aggregator Microservice



## Tools

Apache Maven - https://maven.apache.org/ 



## Build and Run 

Run this project as a Spring Boot app. 

Import into IDE and run Application.java OR 

1. Open command line at project folder 
2. mvn clean install
3. mvn spring-boot:run

Service will start up on port 8082 and register with Eureka.

http://localhost:8082/api



## Resources

| Path             | Description  |
|------------------|--------------|
| localhost:8082/reservations | application context |
| localhost:8082/reservations/health | Displays the health status of the service |
| localhost:8082/reservations/swagger-ui.html | Swagger UI |
| localhost:8082/reservations/id/{id} | GET reservation |



## License

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0



##Notes

Let's assume you have wrapped two service calls A and B as a HystrixCommand. You now have three options:

use .execute(): pure synchronous call. You call the method and continue your program once the result has arrived. Your program's total execution time is the sum both calls. The main flow of your program is very linear.

use .queue(): receive a Future immediately for both commands. Both service calls are executed in parallel. Then use .get() to retrieve the results. These calls with block until the result is there. Your total execution time is faster than before: your execution time will be the length of the longest service call. Use this when you i.e. want to combine the results of the two services. The main flow of your program is still linear, although both calls are executed in parallel.

use .subscribe(): receive a Observable immediately for both commands. Both service calls are executed in parallel. Then use .subscribe() to register a call-back to act on the result once it is available. This is very useful if you don't want to combine the results and want to react independently on the results of service A and B once they arrive. The main flow of your program is no linear, but reactive: the flow of the program will continue inside the callback for each command.
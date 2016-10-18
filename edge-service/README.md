# Spring Cloud - Netflix Zuul


## Tools

Apache Maven - https://maven.apache.org/ 



## Build and Run 

Run this project as a Spring Boot app. 

Import into IDE and run Application.java OR 

1. Open command line at project folder 
2. mvn clean install
3. mvn spring-boot:run

Service will start up on port 8765 and register with Eureka and serve as a gateway to the microservices.

http://localhost:8765/edge



## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D



## Resources

| Path             | Description  |
|------------------|--------------|
| localhost:8765/edge | application context |
| localhost:8765/edge/health | Displays the health status of the service |
| localhost:8765/edge/serviceA/facilities/id/1 | sample REST call |
| localhost:8765/edge/serviceA/facilities/user?username=test | sample REST call |
| localhost:8765/edge/serviceB/customers/id/1 | sample REST call |
| localhost:8765/edge/serviceB/employees/id/1 | sample REST call |



## License

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0
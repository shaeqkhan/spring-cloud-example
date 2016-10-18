# Spring Cloud - Config Server

## Tools

| Apache Maven	   | https://maven.apache.org/ |


## Build and Run 

Run this project as a Spring Boot app. 

Import into IDE and run main method OR 

1. Open command line at project folder 
2. mvn clean install
3. mvn spring-boot:run
 
Service will start up on port 8888 and register with Eureka and communicate to the configured services.
Uses native profiles to load yml files to push.


## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D


## Resources

http://localhost:8888/config

| Path             | Description  |
|------------------|--------------|
| /config   | application context |
| /config/health | Displays the health status of the service |
| /config/{service_name}/{profile_name} | Display config properties of the service for the selected profile |


## Definitions

| Variable         | Description  |
|------------------|--------------|
|{service_name}	   | name of the microservice registered in the Discovery Service, can be found in the bootstrap.yml file {spring.application.name} |
|{profile_name}    | distinct build profiles for environments, default value = 'default' |


## JASYPT Encryption Command for properties

java -cp ~/.m2/repository/org/jasypt/jasypt/1.9.2/jasypt-1.9.2.jar  org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="samplepassword" password=private-key algorithm=PBEWithMD5AndDES

###Sample Output ->

----ENVIRONMENT-----------------

Runtime: Oracle Corporation Java HotSpot(TM) 64-Bit Server VM 24.45-b08

----ARGUMENTS-------------------

algorithm: PBEWithMD5AndDES
input: samplepassword
password: private-key

----OUTPUT----------------------

XcBjfjDDjxeyFBoaEPhG14wEzc6Ja+Xx+hNPrJyQT88=


## License

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0
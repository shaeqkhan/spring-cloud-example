# Spring Cloud Config Server

Run this project as a Spring Boot app (e.g. import into IDE and run main method, or use mvn spring-boot:run). 
It will start up on port 8888 and register with Eureka and communicate to the configured services.
Uses native profiles to load yml files to push.

http://localhost:8888/config_server/status


## Resources

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


## JASYPT Encryption Command

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

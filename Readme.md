
# Introduction
This is an example application of the [Zuul gateway service](https://github.com/Netflix/zuul) 
and the [Eureka service registry](https://github.com/Netflix/eureka).
 There are two REST service available (Books and Series) which register automatically at the Eureka registry.
 Zuul uses Eureka to find available services.

# Run the services
## Eureka
Run the EurekaApplication class
## Zuul 
Run the ZuulApplication class
## Movies service
Run the MovieServiceApplication class
## Series service
Run the SeriesServiceApplication class

# Access the services

### Eureka Web UI 
The Eureka web ui can be loaded vie [http://localhost:8761](http://localhost:8761).
It provides a list of all available services registered at the registry.

### Series Service 
You can access the series service directly via [http://localhost:9080](http://localhost:9080) 
or via zuul [http://localhost:8888/api/series-service](http://localhost:8888/api/series-service)
The series service simulates an error on every third request which results in a fallback response.

### Movies Service 
You can access the movies service directly via [http://localhost:9000](http://localhost:9000)
or via zuul [http://localhost:8888/api/movies-service](http://localhost:8888/api/movies-service)

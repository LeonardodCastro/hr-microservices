# Human Resources System

Mono repo with seven projects as microservices built using [Spring Cloud](https://spring.io/projects/spring-cloud) and tools such as:
- [Feign](https://spring.io/projects/spring-cloud-openfeign): For API request between microservices
- Client-side load balancer with [Ribbon](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-ribbon.html)
- [Eureka](https://cloud.spring.io/spring-cloud-netflix/reference/html/) server to register microservices
- [Api Gateway Zuul](https://github.com/Netflix/zuul) routing and given authorizations
- [Hystrix](https://github.com/Netflix/Hystrix) for latency and fault tolerance avoinding cascading failure
- [OAuth](https://oauth.net/2/) and [JWT](https://jwt.io) to authenticate
- Containerization with [Docker](https://www.docker.com)


## Conceptual Model 
This UML (Unified Modeling Language) its quite simple having just few entities and one relashionship between users and roles (ManyToMany). The project focus is on Spring Cloud solutions implementations and the architeture as well.

<img>![Captura de Tela 2023-11-01 às 10.49.03.png](..%2F..%2Fyt%20stuff%2FGravacoes%2FCaptura%20de%20Tela%202023-11-01%20%C3%A0s%2010.49.03.png)



### Microservice ecosystem architecture

The architecture of microservice below was built thinking of scalability of the system, each green box is a microservice(ms) all of them are registred in Eureka (Discovery server) and catching the configurations from a private repository on Github.

The Zuul gateway is wraping big part of the project making a unique bridge between the system and the client. Also there are two different database (Postgres) for each project and entity.

Finally I drew three instances of worker just to show the system is capable of create and kill instances (scalabe) taking benefits of load balance and keeping the ephemerality.

<img>![Captura de Tela 2023-10-31 às 10.37.23.png](..%2F..%2Fyt%20stuff%2FGravacoes%2FCaptura%20de%20Tela%202023-10-31%20%C3%A0s%2010.37.23.png)

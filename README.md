# Arquitetura baseada em microsserviços usando spring cloud

Este projeto foi desenvolvido utilizando a arquitetura de microsserviços utilizando as tecnologias ElasticSearch e Redis em que sua comunicação tenha sido a partir de um config-server.
Também foi utilizado como interface gráfica para melhor monitoramento dos serviços o Eureka Server.

## O que foi utilizado...

- Java 11;
- Gradle;
- Spring Web;
- Actuator.
- No product-catalog foi utilizado o  ElasticSearch;
- No shopping-cart foi utilizado o  Redis;
- No config-server foi utilizado o Spring Cloud Config Server;
- No discovery foi utilizado o  Cloud Eureka Server;
- E no gateway foi utilizado o Spring Cloud Gateway.
# 📘 Spring Boot Properties Demo

Projeto prático para demonstrar como utilizar Spring Boot Properties e Autoconfiguration.

## 🎯 Objetivos

- Mostrar diferentes formas de carregar propriedades no Spring Boot.
- Utilizar application.properties para definir configurações.
- Injetar propriedades com @Value.
- Usar @ConfigurationProperties para agrupar configurações.
- Customizar portas e propriedades da aplicação.

## 📂 Estrutura de Pastas

```plaintext
spring-boot-properties-demo
 ├── build.gradle.kts
 ├── settings.gradle.kts
 └── src
     ├── main
     │   ├── java
     │   │   └── com.example.propertiesdemo
     │   │       ├── PropertiesDemoApplication.java
     │   │       ├── config
     │   │       │   └── AppConfigProperties.java
     │   │       └── controller
     │   │           └── MessageController.java
     │   └── resources
     │       └── application.properties
     └── test
         └── java
             └── com.example.propertiesdemo
                 └── PropertiesDemoApplicationTests.java

```

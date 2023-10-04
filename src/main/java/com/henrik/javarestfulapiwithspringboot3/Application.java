package com.henrik.javarestfulapiwithspringboot3;

import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
	servers = {
		@Server(url = "/",
		description = "Default Server URL")
	},
	info = @Info(
		title = "Post API",
		description = "Java api with Spring Boot 3, JPA, Swagger, H2 (dev), Postgres (prod) and Mermaid for diagram, it's a simple reddit api, deploy in railway."
	)
)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

package com.example.swaggerInSpringboot.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring Boot Swagger Example API")
                        .version("1.0")
                        .description("This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3."));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("greetings-api")
                .pathsToMatch("/greeting/**")
                .build();
    }
}

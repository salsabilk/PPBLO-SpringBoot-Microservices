package com.salsabil.microservices.product_service_sabil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI productServiceAPI() {
        return new OpenAPI()
            .info(new Info().title("Product Service API")
                .description("This is the REST API for the Product Service")
                .version("v0.0.1")
                .license(new License().name("Apache 2.0")))
            .externalDocs(new ExternalDocumentation()
                .description("You can refer to the Product Services Wiki Documentation")
                .url("http://product-services-dummy-url.com/docs"));
    }

}

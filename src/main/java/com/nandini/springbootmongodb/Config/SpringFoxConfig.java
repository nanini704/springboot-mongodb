package com.nandini.springbootmongodb.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@Configuration
@OpenAPIDefinition
public class SpringFoxConfig {  // You might want to rename this class to OpenApiConfig

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring MongoDB API")
                        .description("API Documentation for Spring MongoDB Application")
                        .version("1.0"));
    }
}
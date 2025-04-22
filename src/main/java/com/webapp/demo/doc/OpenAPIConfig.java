package com.webapp.demo.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
//url : http://localhost:8080/swagger-ui.html
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("REST API - Web Demo")
                        .version("1.0.0")
                        .description("Documentação da API - Web Demo")
                        .contact(new Contact()
                                .name("João Sampaio - Backend Dev")
                                .url("https://github.com/JSampx/")
                                .email("joao.sampaio.andrade@gmail.com")
                        )
                );
    }
}

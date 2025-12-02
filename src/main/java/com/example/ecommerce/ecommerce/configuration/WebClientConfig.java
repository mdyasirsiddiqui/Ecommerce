package com.example.ecommerce.ecommerce.configuration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
@Configuration
@Slf4j
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
        log.info("WebClientConfig");
        return WebClient.builder()
                .baseUrl("https://fakestoreapi.com")
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}

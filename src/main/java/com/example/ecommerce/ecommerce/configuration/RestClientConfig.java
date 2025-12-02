package com.example.ecommerce.ecommerce.configuration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@Slf4j
public class RestClientConfig {
    @Bean
    public RestTemplate restTemplate(){
        log.info(" restTemplate Config");
        return new RestTemplate();
    }
}

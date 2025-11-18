package com.example.ecommerce.ecommerce.Gateway;

import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component @Slf4j
public class FakeStoreProductGateway implements IProductGateway {
    private final WebClient webClient;
    public FakeStoreProductGateway(WebClient webClient)
    {
        this.webClient = webClient;
    }

//    FakeStoreProductGateway(WebClientConfiguration webClientConfiguration)
//    {
//        this.webClient =webClientConfiguration;
//    }
    @Override
    public List<FakeStoreProductResponseDTO> getALLProducts() {
        log.info("in ProductGateway class");
        return webClient.get()
                .uri("/products")
                .retrieve()
                .bodyToFlux(FakeStoreProductResponseDTO.class)
                .collectList()
                .block();
    }
}


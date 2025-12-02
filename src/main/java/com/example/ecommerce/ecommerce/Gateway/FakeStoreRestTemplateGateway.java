package com.example.ecommerce.ecommerce.Gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
@Slf4j
@Component("thisOneIsRestTemplate")
public class FakeStoreRestTemplateGateway implements  ICategoryGateway{
    private final RestTemplate restTemplate;
    public FakeStoreRestTemplateGateway(RestTemplate restTemplate)
    {
        this.restTemplate=restTemplate;
    }

    @Override
    public List<String> getAllCategories() throws IOException {
        log.info("in FakeStoreRestTemplateGateway");
        return restTemplate.getForObject("https://fakestoreapi.com/products/categories/",List.class);
    }
}

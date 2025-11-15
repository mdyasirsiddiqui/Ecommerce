package com.example.ecommerce.ecommerce.configuration;

import com.example.ecommerce.ecommerce.Gateway.API.FakeStoreCategoryAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
@Slf4j
@Configuration
public class RetroConfig {
    @Bean
    Retrofit retrofit()
    {
        log.info("Retrofit Config");
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/products/categories/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    @Bean
    public FakeStoreCategoryAPI fakeStoreCategoryAPI(Retrofit retrofit)
    {
        log.info("FakeStoreCategoryAPI Config");
        return retrofit.create(FakeStoreCategoryAPI.class);
    }
}

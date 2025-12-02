package com.example.ecommerce.ecommerce.Gateway.API;

import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

@Component
public interface FakeStoreCategoryAPI {
    @GET("/products/categories")
    public Call<List<String>> getAllCategories() throws IndexOutOfBoundsException;
}

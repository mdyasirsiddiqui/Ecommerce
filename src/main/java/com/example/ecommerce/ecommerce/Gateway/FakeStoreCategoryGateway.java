package com.example.ecommerce.ecommerce.Gateway;

import com.example.ecommerce.ecommerce.Gateway.API.FakeStoreCategoryAPI;
import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Slf4j
@Component()
public class FakeStoreCategoryGateway implements ICategoryGateway{
    private FakeStoreCategoryAPI fakeStoreCategoryAPI;
    FakeStoreCategoryGateway(FakeStoreCategoryAPI fakeStoreCategoryAPI)
    {
        this.fakeStoreCategoryAPI=fakeStoreCategoryAPI;
    }
    @Override
    public List<String> getAllCategories() throws IOException {
        log.info("in ICategoryGateway class");
        List<String> response= this.fakeStoreCategoryAPI.getAllCategories().execute().body();
        if(Optional.ofNullable(response).isEmpty())
        {
            throw new IOException("No categories found");
        }
        return new ArrayList<>(response);
    }

}

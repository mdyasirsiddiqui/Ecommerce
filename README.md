# Ecommerce Project

## 📌 Overview
This is a Spring Boot based ecommerce project that integrates with the [FakeStore API](https://fakestoreapi.com/) to fetch product categories and products.  
It demonstrates a clean layered architecture with **Controller → Service → Gateway → API Client**, using DTOs for structured responses.

---

## 🚀 Features
- REST API endpoint: `/categories`
    - Fetches categories from FakeStore API (`https://fakestoreapi.com/products/categories`)
- REST API endpoint: `/products`
    - Fetches all products from FakeStore API (`https://fakestoreapi.com/products`)
- Uses **WebClient** and **Retrofit** for external API calls
- REST API ep getAllCategories ('/categories') using @Qualifier and using RestTemplate
- Logging with **Slf4j**
- Built with **Gradle**

---

## 🛠 Tech Stack
- **Java 21**
- **Spring Boot**
- **WebClient**
- **Retrofit**
- **Rst Template**
- **Lombok**
- **Gradle**

---

## Markdown
# v1.1.5
-- Service Registered at eureka client

# v1.1.4
-- Implementing Flyway migration and adding db versions

# v1.1.3
-- Implement Global Exception Handling

# v1.1.2
-- Add Entity using JPA and add database connectivity.
# v1.1.1
Implement '/getAllCategories' endpoint Integrated with RestTemplate. Using @Qualifier for RestTemplate and aslo implement MODEL MAPPER for DTO Conversion.

# v1.1.0
Implemented '/getAllProducts' endpoint Integrated with FakeStore API using WebClient.

# v1.0.0 
Initial version Implemented `/categories` endpoint Integrated with FakeStore API using Retrofit.

-------




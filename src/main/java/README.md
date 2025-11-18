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
- Logging with **Slf4j**
- Built with **Gradle**

---

## 🛠 Tech Stack
- **Java 17**
- **Spring Boot**
- **WebClient**
- **Lombok**
- **Gradle**

---

## Markdown

#v1.1.0
Implemented '/getAllProducts' endpoint Integrated with FakeStore API using WebClient.

# v1.0.0 
Initial version Implemented `/categories` endpoint Integrated with FakeStore API using Retrofit.

-------




# Ecommerce Project

## 📌 Overview
This is a Spring Boot based ecommerce project that integrates with the [FakeStore API](https://fakestoreapi.com/) to fetch product categories.  
It demonstrates a clean layered architecture with **Controller → Service → Gateway → Retrofit API**, using DTOs for structured responses.

---

## 🚀 Features
- REST API endpoint: `/categories`
- Fetches categories from FakeStore API (`https://fakestoreapi.com/products/categories`)
- Uses **Retrofit2 + Gson** for external API calls
- DTOs for clean data transfer
- Logging with **Slf4j**
- Built with **Gradle**

---

## 🛠 Tech Stack
- **Java 17**
- **Spring Boot**
- **Retrofit2**
- **Lombok**
- **Gradle**

---

## 📌 Versions / Changelog

### v1.0.0
- Initial version
- Implemented `/categories` endpoint
- Using `List<String>` as DTO for categories
- Integrated with FakeStore API (`/products/categories`)

-------

## 📂 Project Structure
ecommerce/ │
├── README.md
├── build.gradle
├── settings.gradle
└── src/ 
└── main/
└── java/
└── com/example/ecommerce/ecommerce
├── EcommerceApplication.java # Main Spring Boot application │
├── controller/ # REST Controllers │
└── CategoryController.java │
├── service/ # Business logic layer │
├── CategoryService.java │
└── ICategoryService.java │
├── Gateway/ # External API integration │
├── FakeStoreCategoryGateway.java │
├── ICategoryGateway.java │
└── API/ │
└── FakeStoreCategoryAPI.java │
├── dto/ # Data Transfer Objects │
├── CategoryDTO.java │
└── FakeStoreCategoryResponseDTO.java (future use) │
└── configuration/ # Config classes 
└── RetroConfig.java



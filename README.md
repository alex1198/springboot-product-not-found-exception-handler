# Spring Boot - E-Commerce Product Not Found Exception

## Project Overview

This is a Spring Boot REST API project that demonstrates Global Exception Handling using `@RestControllerAdvice`.

The application allows users to search for a product by its ID. If the requested product does not exist, the application throws an exception and returns a custom error response with HTTP Status **404 (Not Found)**.

---

## Objective

Handle the case when a user searches for a product that does not exist in the system.

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- REST API

---

## Project Structure

```
src
└── main
    └── java
        └── com.alex
            ├── controller
            │   └── ProductController.java
            ├── entity
            │   └── Product.java
            ├── exception
            │   ├── ErrorResponse.java
            │   ├── GlobalExceptionHandler.java
            │   └── ProductNotFoundException.java
            └── service
                └── ProductService.java
```

---

## REST API

### Get Product By ID

**Request**

```
GET /product/{id}
```

Example

```
GET /product/101
```

---

## Successful Response

```json
{
    "productId": 101,
    "productName": "Laptop"
}
```

---

## Error Response

If the product does not exist:

```json
{
    "message": "Product Not Found",
    "status": 404
}
```

> If using the assignment's exact response format:

```json
{
    "error": "Product Not Found",
    "status": 404
}
```

---

## Business Logic

- Search product using Product ID.
- Return product details if found.
- Throw an exception when the product is not found.
- Handle the exception globally using `@RestControllerAdvice`.
- Return HTTP Status **404 Not Found**.

---

## Features

- REST API Development
- Spring Boot
- Exception Handling
- Custom Exception
- Global Exception Handler
- Clean Project Structure

---

## Author

Alex Christian

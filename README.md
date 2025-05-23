# 📷 Album Management API

_A Spring Boot REST API for managing photo albums with secure authentication_

## 🌟 Features

- **Album CRUD** - Create, read, update, delete albums
- **Photo Management** - Upload/download photos with thumbnails
- **JWT Authentication** - Secure user login/registration
- **Swagger Documentation** - Interactive API explorer

## 🛠️ Tech Stack

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue)
![JWT](https://img.shields.io/badge/JWT-Auth-orange)

- Java 17 + Spring Boot 3
- Spring Security + JWT
- PostgreSQL (or H2 for development)
- OpenAPI 3.0 (Swagger UI)
- Maven

- sequenceDiagram
  -   participant User
  -   participant API
  -   User->>API: POST /auth/token (credentials)
  -   API->>User: Returns JWT
  -   User->>API: Requests with JWT header
  -  API->>User: Returns protected data

## 🚀 Quick Start

```bash
# Clone repository
git clone https://github.com/nilesh5566/Album-Api.git
cd Album-Api

# Build and run
mvn clean install
mvn spring-boot:run

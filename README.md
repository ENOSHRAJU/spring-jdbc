# Spring Boot JDBC Template Demo

## 🚀 Overview
This project demonstrates database interaction using Spring Boot's JdbcTemplate without using JPA or Hibernate.
It performs CRUD operations using direct SQL queries and connects to an H2 in-memory database.

The main objective of this project is to understand how Spring interacts with relational databases at a lower level using JDBC while still leveraging Spring Boot features.

---

## 🔧 Features

- CRUD operations using JdbcTemplate
- Direct SQL query execution
- Row mapping using RowMapper
- H2 in-memory database integration
- Exception handling
- Clean layered architecture (Controller → Service → JDBC)

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring JDBC
- H2 Database
- Maven

---

## 🗄️ Database Configuration

This project uses H2 in-memory database for simplicity and fast development.

Example configuration:

spring.datasource.url=jdbc:h2:mem:testdb  
spring.datasource.driverClassName=org.h2.Driver  
spring.datasource.username=sa  
spring.datasource.password=  
spring.h2.console.enabled=true  

H2 Console can be accessed at:
http://localhost:8080/h2-console

---

## 📂 Project Structure

Controller → Handles HTTP requests  
Service → Contains business logic  
JdbcTemplate → Executes SQL queries  
Database → H2 in-memory database  

---

## ▶️ How to Run

1. Clone the repository  
2. Navigate to the project folder  
3. Run the application using:

mvn spring-boot:run  

4. Access H2 Console (if enabled):
http://localhost:8080/h2-console

---

## 📌 Why JdbcTemplate Instead of JPA?

This project intentionally avoids JPA to:

- Understand raw SQL execution
- Gain better control over queries
- Learn how Spring abstracts JDBC boilerplate code
- Understand lower-level database interaction
- Explore how data is mapped manually using RowMapper

---

## 📖 Learning Outcomes

- Difference between JPA and JDBC
- How Spring Boot auto-configures DataSource
- How JdbcTemplate simplifies traditional JDBC code
- How to map ResultSet to Java objects
- How to structure a clean Spring Boot application without ORM

---

## 👨‍💻 Author

Enosh Raju

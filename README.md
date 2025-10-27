# Jobvault-backend

# HRMS (Human Resource Management System) — Jobvault Backend

## Description

**HRMS (Human Resource Management System)** is a Spring Boot-based web service for managing job postings, applications, employers, and candidates.  
It follows REST architecture and includes DTOs, Request-Response Pattern, Validation, and Global Exception Handling.

### Features
- City Management: Add and list cities
- Job Position Management: Add and list job positions
- Employer Management: Register and list employers
- Candidate Management: Register and list job seekers
- Job Advertisement Management: Add, list, and filter job ads
- Job Application: Candidates can apply to job ads
- Error Handling: Global exception handling with `@ControllerAdvice`
- Validation: Field validation using annotations like `@NotBlank`, `@Size`

### Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MYSQL
- Lombok
- Jakarta Validation API
- Jackson
- Postman for API testing
- Swaager UI

---

## Project Architecture

- **Entity**: Maps database tables
- **DTO**: Data Transfer Objects for responses
- **Request**: Incoming API payloads
- **Service**: Business logic layer
- **Repository (DAO)**: Database access layer
- **Controller**: REST API endpoints
- **Core Utilities**: `Result`, `DataResult<T>`, `SuccessResult`, `ErrorResult`

## Result Structure

- `Result`: Returns success/failure + message
- `DataResult<T>`: Returns success/failure + data
- `SuccessResult`, `ErrorResult`: Predefined classes for success/error responses

---

## Sample API Endpoints

| HTTP | Endpoint                             | Description                      |
|------|--------------------------------------|----------------------------------|
| POST | `/api/employers/register`           | Register a new employer          |
| GET  | `/api/employers/getAll`             | Get all employers                |
| POST | `/api/candidateController/register` | Register a new candidate         |
| GET  | `/api/candidateController/getAll`   | Get all candidates               |
| POST | `/api/jobAdvertisements/add`        | Add a new job advertisement      |
| GET  | `/api/jobAdvertisements/getAll`     | Get all job advertisements       |
| POST | `/api/jobApplications/apply`        | Apply for a job advertisement    |

## Sample JSON Requests

### Employer Registration

json
{
  "companyName": "Tech Solutions Ltd.",
  "companyWebPage": "https://techsolutions.com",
  "email": "contact@techsolutions.com",
  "phoneNumber": "+1-555-123-4567",
  "password": "password123",
  "confirmPassword": "password123"
}

### Candidate Registration

json
{
  "name": "Aysu",
  "lastName": "Ay",
  "nationalId": "12345678901",
  "birthDate": 2000,
  "email": "aysu@example.com",
  "password": "password123",
  "confirmPassword": "password123"
}

**Setup Instructions**

# Clone the repository
git clone https://github.com/imran-049-imran/Jobvault-backend.git

# Navigate into the project
cd Jobvault-backend

# Build and run the application
./mvnw spring-boot:run

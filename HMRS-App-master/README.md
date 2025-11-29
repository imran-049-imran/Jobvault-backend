 HRMS (Human Resource Management System)

A modern, scalable Human Resource Management System built using Spring Boot, designed for managing job advertisements, job applications, employers, and candidates through a clean and well-structured REST API.

 Project Overview

HRMS is a backend-focused application following N-Layer Architecture and REST API standards.
It includes:

DTO Layer

Request–Response Pattern

Global Exception Handling

Validation (Jakarta Validation)

Service–Repository architecture

Clean JSON responses using Result wrappers

 Features

 City Management – Add & list cities

 Job Position Management – Add & list job roles

 Employer Management – Register & list employers

 Candidate Management – Register & list candidates

 Job Advertisement Management – Add, list, filter job ads

 Job Application System – Candidates apply to job ads

 Global Exception Handling (@ControllerAdvice)

Validation using @NotBlank, @Size, @Email, etc.

 Technologies Used

Java 17

Spring Boot

Spring Data JPA (Hibernate)

PostgreSQL

Lombok

Jakarta Validation

Jackson

Postman (API Testing)

 Project Architecture

Entity Layer → Database tables

DTO Layer → Response objects

Request Layer → Incoming request bodies

Service Layer → Business logic

Repository Layer → Database access

Controller Layer → REST endpoints

Core Utilities → Result, DataResult, SuccessResult, ErrorResult, Exceptions
```
📁 Project Structure
hrms/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/hrms/
│   │   │       ├── controller/
│   │   │       ├── dto/
│   │   │       ├── request/
│   │   │       ├── entity/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       ├── core/
│   │   │       │   ├── utilities/
│   │   │       │   └── exceptions/
│   │   │       └── HrmsApplication.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   ├── data.sql
│   │   │   └── schema.sql
│   ├── test/
│   │   └── java/
├── .gitignore
├── pom.xml
└── README.md
```

 API Endpoints
Employer APIs
Method	Endpoint	Description
POST	/api/employers/register	Register a new employer
GET	/api/employers/getAll	Get all employers
Candidate APIs
Method	Endpoint	Description
POST	/api/candidates/register	Register a new candidate
GET	/api/candidates/getAll	Get all candidates
Job Advertisement APIs
Method	Endpoint	Description
POST	/api/jobAdvertisements/add	Add a job advertisement
GET	/api/jobAdvertisements/getAll	List all job advertisements
Job Application APIs
Method	Endpoint	Description
POST	/api/jobApplications/apply	Apply to a job ad
 Sample JSON Requests
 Employer Registration
{
  "companyName": "Tech Solutions Ltd.",
  "companyWebPage": "https://techsolutions.com",
  "email": "contact@techsolutions.com",
  "phoneNumber": "+1-555-123-4567",
  "password": "password123",
  "confirmPassword": "password123"
}

 Candidate Registration
{
  "name": "Aysu",
  "lastName": "Ay",
  "nationalId": "12345678901",
  "birthDate": 2000,
  "email": "aysu@example.com",
  "password": "password123",
  "confirmPassword": "password123"
}


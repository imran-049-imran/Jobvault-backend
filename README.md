# Jobvault-backend

# HRMS (Human Resource Management System) — Jobvault Backend

HRMS (Human Resource Management System) is a Spring Boot-based web service designed to manage job postings, applications, employers, and candidates.
It follows REST architecture and implements DTOs, Request-Response Pattern, Validation, and Global Exception Handling for clean and scalable backend development.

# Features

🏙️ City Management: Add and list cities

💼 Job Position Management: Add and list job positions

🏢 Employer Management: Register and list employers

👩‍💻 Candidate Management: Register and list job seekers

📢 Job Advertisement Management: Add, list, and filter job ads

📩 Job Application: Candidates can apply to job ads

⚠️ Error Handling: Global exception handling with @ControllerAdvice

✅ Validation: Field validation using annotations like @NotBlank, @Size

# Technologies Used

Java 17

Spring Boot

Spring Data JPA (Hibernate)

MySQL

Lombok

Jakarta Validation API

Jackson

Postman (API testing)

Swagger UI (API documentation)

```
# Project Architecture
Entity → Maps database tables

DTO → Data Transfer Objects for responses

Request → Incoming API payloads

Service → Business logic layer

Repository (DAO) → Database access layer

Controller → REST API endpoints

Core Utilities → Result, DataResult<T>, SuccessResult, ErrorResult
```

# Result Structure
Result → Returns success/failure + message

DataResult<T> → Returns success/failure + data

SuccessResult, ErrorResult → Predefined classes for success/error responses
```
#  Sample API Endpoints

HTTP	Endpoint	Description
POST	/api/employers/register	Register a new employer
GET	/api/employers/getAll	Get all employers
POST	/api/candidateController/register	Register a new candidate
GET	/api/candidateController/getAll	Get all candidates
POST	/api/jobAdvertisements/add	Add a new job advertisement
GET	/api/jobAdvertisements/getAll	Get all job advertisements
POST	/api/jobApplications/apply	Apply for a job advertisement
```

# Sample JSON Requests

# Employer Registration
json
{
  "companyName": "Tech Solutions Ltd.",
  "companyWebPage": "https://techsolutions.com",
  "email": "contact@techsolutions.com",
  "phoneNumber": "+1-555-123-4567",
  "password": "password123",
  "confirmPassword": "password123"
}

# Candidate Registration
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

⚙️ Setup Instructions
1️⃣ Clone the repository

bash
git clone https://github.com/imran-049-imran/Jobvault-backend.git
2️⃣ Navigate into the project

bash
cd Jobvault-backend
3️⃣ Build and run the application

bash
./mvnw spring-boot:run
4️⃣ Access the backend

Code
http://localhost:8080

# Future Enhancements

🔐 JWT-based authentication & role-based access

📊 Admin dashboard for job analytics

📤 Export job applications in PDF/Excel formats

🌐 Frontend integration with React/Angular

🤝 Contributing
Contributions are welcome!
Fork the repo, create a branch, make your changes, and submit a pull request.

📜 License
This project is licensed under the MIT License – free to use and modify.

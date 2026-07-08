# Java Spring Boot Backend

A lightweight Spring Boot REST API for User Management. This project serves as a backend service that maintains an in-memory repository of user profiles.

---

## 🛠️ Tech Stack

- **Java**: Version 17
- **Framework**: Spring Boot 4.1.0
- **Build Tool**: Maven
- **Database**: In-memory repository (simulated using list structures)

---

## 📁 Project Structure

```text
src/main/java/com/spring_project/java_backend/
├── JavaBackendApplication.java    # Application entry point
├── controllers/
│   └── UserControllers.java       # REST API endpoints controller
├── services/
│   └── UserService.java           # Business logic layer
├── repository/
│   └── UserRepository.java       # In-memory user data storage (mock database)
└── dto/
    ├── CreateUserDto.java         # DTO for user creation and updates
    └── UserDto.java               # DTO representing a returned user object
```

---

## 🚀 Getting Started

### Prerequisites
- [Java Development Kit (JDK) 17](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi) (optional, Maven wrapper is included)

### Running the Application

1. Clone or navigate to the repository directory:
   ```bash
   cd /Users/mohitkalshan/Desktop/Projects/java-backend
   ```
2. Build and run the application using the Maven wrapper:
   - **macOS/Linux**:
     ```bash
     ./mvnw spring-boot:run
     ```
   - **Windows**:
     ```cmd
     mvnw.cmd spring-boot:run
     ```
3. The server will start and be available at: `http://localhost:8080`

### Running Tests

To run the unit tests, execute:
```bash
./mvnw test
```

---

## 🔌 API Endpoints

All endpoints have the base URL path `/api/users`.

### 1. Get All Users
Retrieves a list of all active users. The repository comes pre-populated with two default users: **Mohit** and **Rahul**.
- **URL**: `/api/users`
- **Method**: `GET`
- **Sample Curl**:
  ```bash
  curl -X GET http://localhost:8080/api/users
  ```
- **Response**: `200 OK`
  ```json
  [
    {
      "id": "a1b2c3d4-e5f6-7a8b-9c0d-1e2f3a4b5c6d",
      "name": "Mohit",
      "email": "mohit@example.com"
    },
    {
      "id": "f5e4d3c2-b1a0-9f8e-7d6c-5b4a3f2e1d0c",
      "name": "Rahul",
      "email": "rahul@example.com"
    }
  ]
  ```

### 2. Get User By ID
Retrieves a specific user using their unique ID.
- **URL**: `/api/users/{id}`
- **Method**: `GET`
- **Sample Curl**:
  ```bash
  curl -X GET http://localhost:8080/api/users/{id}
  ```
- **Response**: `200 OK`

### 3. Create User
Creates a new user.
- **URL**: `/api/users`
- **Method**: `POST`
- **Headers**: `Content-Type: application/json`
- **Request Body**:
  ```json
  {
    "name": "Jane Doe",
    "email": "jane.doe@example.com"
  }
  ```
- **Sample Curl**:
  ```bash
  curl -X POST http://localhost:8080/api/users \
    -H "Content-Type: application/json" \
    -d '{"name": "Jane Doe", "email": "jane.doe@example.com"}'
  ```
- **Response**: `201 Created`

### 4. Update User
Updates an existing user's name or email by their ID.
- **URL**: `/api/users/{id}`
- **Method**: `PUT`
- **Headers**: `Content-Type: application/json`
- **Request Body**:
  ```json
  {
    "name": "Jane Smith",
    "email": "jane.smith@example.com"
  }
  ```
- **Sample Curl**:
  ```bash
  curl -X PUT http://localhost:8080/api/users/{id} \
    -H "Content-Type: application/json" \
    -d '{"name": "Jane Smith", "email": "jane.smith@example.com"}'
  ```
- **Response**: `200 OK`

### 5. Delete User
Deletes a user by their ID.
- **URL**: `/api/users/{id}`
- **Method**: `DELETE`
- **Sample Curl**:
  ```bash
  curl -X DELETE http://localhost:8080/api/users/{id}
  ```
- **Response**: `204 No Content`

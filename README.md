# Spring Boot Project: Student Book Author

This Spring Boot project is designed to fulfill the functional requirements specified for managing users, authors, and books, along with providing necessary APIs for interaction.

## Functionalities

1. **User Registration and Login**:
   - Users can register as either students or authors.
   - JWT (JSON Web Tokens) are employed for secure authentication.

2. **User Types**:
   - **Student**: Can log in and access books for reading.
   - **Author**: Can log in and create new books.

3. **API Endpoints**:
   - Retrieve a list of all readers for a specific book.
   - View the list of books a student is currently reading.
   - Authors can delete their own books.

## Domain Objects

### Student
- Properties: 
  - username
  - age
  - list of books they're currently reading

### Author
- Properties: 
  - username
  - age
  - list of books they've authored

### User
- Properties: 
  - username
  - age
  - list of books they have

### Book
- Properties: 
  - name
  - author of the book

## Setup Instructions

1. Clone the repository: `git clone https://github.com/your-username/student-book-author.git`
2. Navigate to the project directory: `cd student-book-author`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

## API Documentation

### Authentication

- **Endpoint**: `/auth/login`
- **Method**: POST
- **Description**: Login with username and password to obtain JWT token.

### Student API

- **Endpoint**: `/api/student/books`
- **Method**: GET
- **Description**: Retrieve the list of books a student is currently reading.

### Author API

- **Endpoint**: `/api/author/books`
- **Method**: POST
- **Description**: Create a new book.

- **Endpoint**: `/api/author/books/{bookId}`
- **Method**: DELETE
- **Description**: Delete a book authored by the logged-in author.

- **Endpoint**: `/api/author/books/{bookId}/readers`
- **Method**: GET
- **Description**: Retrieve a list of all readers for a specific book.

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JSON Web Tokens (JWT)


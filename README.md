# WritterLo

It is an ebook sales platform, allowing users to create books on the website and edit them when necessary.

## Overview

![image](https://github.com/gabrielFrc/MyWritter/assets/70562629/efb4f0a3-4f82-4924-949e-8cceb67a5ea8)

## Technologies Used

- **Frontend:**
  - [WritterLo FrontEnd](https://github.com/gabrielFrc/MyWritter/): View Front End repository.

- **Backend:**
  - [Java](https://www.java.com/): Programming language used for backend development.
  - [Spring Framework](https://spring.io/): Java framework for building enterprise applications.
  - [PostgreSQL](https://www.postgresql.org/): Relational database used for data storage.

## Key Features

- CRUD creation: GET, POST, and PATCH methods.

#### GET - Getting all books from the database.
![image](https://github.com/gabrielFrc/MyWritter/assets/70562629/e066739f-9264-47ae-be96-b875acb76195)
#### POST - Posting a new book to the database.
![image](https://github.com/gabrielFrc/WritterloBackend/assets/70562629/969e964c-e3b2-4f8d-a537-eb64524b1c73)
#### PATCH - Editing a specific book.
![image](https://github.com/gabrielFrc/WritterloBackend/assets/70562629/f2b1b491-e189-40ee-9d72-d22b77d2bb2d)

## Environment Setup

Before getting started, ensure you have the following tools installed on your machine:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Apache Maven](https://maven.apache.org/)

Also, make sure you have a running instance of PostgreSQL and the necessary access credentials.

## Starting the Server

Follow these steps to start the backend server:

1. Clone this repository to your local environment using the following command:

    ```bash
    git clone https://github.com/gabrielFrc/WritterloBackend.git
    ```

2. Navigate to the project directory:

    ```bash
    cd WritterloBackend
    ```

3. Compile the project using Maven:

    ```bash
    mvn clean package
    ```

4. Execute the generated JAR file:

    ```bash
    java -jar target/writterlo-backend.jar
    ```

This will start the backend server and it will be ready to be accessed at `http://localhost:8080`.

## Additional Configuration

If necessary, you can adjust the database configuration and other properties in the `application.properties` file located at `src/main/resources`.

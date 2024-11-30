# Api-Microservices Repository

This repository contains multiple small and simple Spring Boot projects that explain various concepts from the world of APIs and Microservices. Each project demonstrates a specific topic such as transactions, image insertion, user security, Swagger integration, and more.

## Projects Included

Here are some of the main concepts covered in the projects:

- **@Transactional**: Demonstrates how to use the `@Transactional` annotation to manage transactions in Spring Boot applications.
- **Uni-directional and Bi-directional transactions**: Shows examples of one-to-many and many-to-many relationships with both uni- and bi-directional transactions.
- **Image Insertion using @Lob**: Explains how to store images in a database using the `@Lob` annotation.
- **User Security**: Covers how to provide security to users, including authentication and authorization mechanisms.
- **Swagger**: Integration of Swagger UI for API documentation and testing.
- **Logging**: Using logging in Spring Boot for better debugging and monitoring.
- **REST APIs**: Examples of RESTful API implementations, including GET, POST, PUT, DELETE operations.
- **Controller Classes, Service Classes, and Repositories**: Best practices for organizing code into controller, service, and repository layers.

## Prerequisites
Make sure you have the following installed:
- Java 8 or higher
- Maven or Gradle
- Spring Boot (These projects are built on Spring Boot)
- IDE that supports SpringBoot

## Getting Started

To get started with any project in this repository, follow these steps:

### Clone the Repository

You can clone the entire repository to your local machine using the following command:

    ```bash
    git clone https://github.com/your-username/Api-Microservices.git

### To Pull a Single Project
If you only want to pull a specific project from this repository, follow these instructions:
  - 1. **Clone the repository:**
         ```bash
         git clone --no-checkout https://github.com/your-username/Api-Microservices.git
      This will clone the repository but not checkout any files yet.  
       
  - 2. **Navigate into the cloned repository:**
        ```bash
        cd Api-Microservices
        
  - 3. **Enable sparse-checkout:**
       This will allow you to specify which directories to pull.
         ```bash
         git sparse-checkout init --cone
  - 4. **Specify the folder you want and pull it:**
       Now, you'll configure which folder (project) to checkout. Replace "project-folder-name" with the name of the project folder you want to pull
         ```bash
         git sparse-checkout set <project-folder-name>
         

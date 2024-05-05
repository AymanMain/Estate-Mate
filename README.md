Got it! Here's the updated README file without the tenant management section:

---

# Estate Mate

Estate Mate is a web application designed to streamline the management of real estate properties. It provides functionalities for property owners and administrators to manage various aspects of property management efficiently.

## Features

- **User Management**: The application supports multiple user roles, including property owners and administrators, each with specific permissions and functionalities.
- **Property Listings**: Property owners can list their properties on the platform, providing details such as location, amenities, rent, and more.
- **Administrative Tools**: Administrators have access to administrative tools to manage user accounts, properties, rental agreements, payments, and more.

## Technologies Used

- **Java**: The backend of the application is developed using Java, leveraging Spring Boot framework for building robust and scalable web applications.
- **Spring Boot**: Spring Boot is used for rapid application development, providing features like auto-configuration and embedded web server.
- **Spring Data JPA**: Spring Data JPA simplifies data access and persistence by providing repositories and query methods for interacting with the database.
- **Thymeleaf**: Thymeleaf is used as the template engine for server-side rendering of web pages, providing a natural way to build dynamic web applications.
- **Hibernate**: Hibernate ORM is used for object-relational mapping, simplifying database interactions and providing features like caching and lazy loading.
- **H2 Database**: H2 is used as an in-memory database during development for quick and lightweight testing of database interactions.
- **Lombok**: Lombok is used to reduce boilerplate code by generating getters, setters, constructors, and other repetitive code automatically.
- **Spring Security**: Spring Security is used for authentication and authorization, ensuring secure access to application resources.

## Getting Started

To run the Estate Mate application locally, follow these steps:

1. Clone the repository to your local machine.
2. Make sure you have Java Development Kit (JDK) installed on your system.
3. Navigate to the project directory in your terminal or command prompt.
4. Run the application using the following command:

```
./mvnw spring-boot:run
```

5. Once the application is running, you can access it in your web browser at `http://localhost:8080`.

## Configuration

- The application configuration can be found in the `application.properties` file located in the `src/main/resources` directory.
- Modify the configuration properties as needed, such as database connection details, server port, etc.

## Contributing

Contributions to the Estate Mate project are welcome! If you have suggestions for new features, improvements, or bug fixes, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
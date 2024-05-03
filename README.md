## Estate-Mate: A Real Estate Management Application

**Welcome to Estate-Mate!**

This project provides a foundation for building a real estate management application. It utilizes Spring Data JPA for data persistence and offers services for managing properties, users, applications, roles (optional), and images (if using an Image entity).

**Getting Started:**

**Prerequisites:**

* Java 11 or later
* Maven or Gradle (for building the project)
* A database server (e.g., MySQL, PostgreSQL)

**Clone the repository:**

```bash
git clone https://github.com/your-username/estate-mate.git
```

**Configure the database:**

* Update the `application.properties` file with your database connection details (URL, username, password).

**Build the project:**

* Use Maven: `mvn clean install`
* Use Gradle: `./gradlew build`

**Run the application:**

* You can use a Java IDE or run the application class directly (e.g., `java -jar estate-mate.jar`).

**Features:**

* **Entity Classes:**
    * User
    * Property
    * Application (optional relationship with User and Property)
    * Role (optional)
    * Image (optional)
* **Services:**
    * UserService: CRUD operations for users
    * PropertyService: CRUD operations for properties, including searching by city
    * ApplicationService: CRUD operations for applications, including filtering by property and status
    * RoleService (optional): CRUD operations for roles (for user roles)
    * ImageService (optional): CRUD operations for images (for property images)
* **Spring Data JPA:** Provides data persistence and automatic query generation.

**Additional Notes:**

* The `ImageService` is included for managing property images (assuming an `Image` entity exists). If you don't plan to use images, you can disregard this service.
* The `RoleService` is optional and provides functionalities for managing user roles. You can implement it if needed for your project.
* Consider adding unit tests for your services and repositories to ensure code quality.

**Contribution:**

Feel free to fork this repository and contribute your improvements!
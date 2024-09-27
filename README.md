# biznakonnect

biznakonnect is a Spring Boot application designed to connect various service-based businesses (such as barbers, salons, manicurists, etc.) with potential customers. The platform allows business owners to create profiles, list their services, and connect with customers, while customers can search for and book services from local businesses.

## Features

- User registration and authentication
- Business profile creation and management
- Customer search and booking system
- Review and rating system (planned)
- Payment integration for business subscriptions (planned)

## Tech Stack

- Java 17
- Spring Boot 3.3.4
- Spring Data JPA
- Spring Security
- Thymeleaf
- MySQL
- Maven
- Lombok

## Project Structure

```
com.bizna.biznakonnect
├── config
│   ├── SecurityConfig.java
│   └── WebConfig.java
├── controller
│   ├── UserController.java
│   ├── BusinessController.java
│   └── HomeController.java
├── model
│   ├── User.java
│   └── Business.java
├── repository
│   ├── UserRepository.java
│   └── BusinessRepository.java
├── service
│   ├── UserService.java
│   ├── UserServiceImpl.java
│   ├── BusinessService.java
│   └── BusinessServiceImpl.java
├── dto
│   ├── UserDTO.java
│   └── BusinessDTO.java
├── exception
│   └── BusinessException.java
├── util
│   └── StringUtils.java
```

## Setup and Installation

1. Ensure you have Java 17 and Maven installed on your system.
2. Clone the repository:
   ```
   git clone https://github.com/Collins-Rop/biznakonnect.git
   ```
3. Navigate to the project directory:
   ```
   cd biznakonnect
   ```
4. Update `src/main/resources/application.properties` with your database configuration:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/biznakonnect?useSSL=false&serverTimezone=UTC
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
5. Build the project:
   ```
   mvn clean install
   ```
6. Run the application:
   ```
   mvn spring-boot:run
   ```
7. Access the application at `http://localhost:8080`

## API Endpoints

- `/api/users`: User-related operations
- `/api/businesses`: Business-related operations

For detailed API documentation, please refer to the API Documentation file (to be created).

## Contributing

We welcome contributions to biznakonnect! Please follow these steps to contribute:

1. Fork the repository
2. Create a new branch for your feature (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

Collins Rop - colinrop68@gmail.com

Project Link: https://github.com/Collins-Rop/biznakonnect
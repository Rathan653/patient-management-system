# Patient Management system
The Patient Management System is a microservices-based healthcare application designed to streamline patient data management, appointment scheduling, and medical record access. Built with Spring Boot, it leverages gRPC for inter-service communication, Kafka for event-driven messaging, and JWT for secure authentication. The system is containerized using Docker and orchestrated via Docker Compose, making it easy to deploy and scale.

## 🚀 Prerequisites

Make sure you have the following installed:

- **Docker**: [Install Docker](https://docs.docker.com/get-docker/)
- **Docker Compose**: [Install Docker Compose](https://docs.docker.com/compose/install/)
- **Java (if running locally)**: JDK 17 or above  
- **Maven (if building locally)**: [Install Maven](https://maven.apache.org/install.html)

---
## ## Running the Services
1. Navigate to your project directory.
2. Run the following command to build and start all services:
   ```bash
   docker compose up --build 

And you are all set, feel free to fork the repository and make changes 

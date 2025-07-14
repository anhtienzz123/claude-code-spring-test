# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Spring Boot demo application using Java 17 and Spring Boot 3.2.5. The application provides a simple REST API with basic endpoints.

## Build and Development Commands

**Build the project:**
```bash
mvn clean compile
```

**Run the application:**
```bash
mvn spring-boot:run
```

**Run tests:**
```bash
mvn test
```

**Package the application:**
```bash
mvn clean package
```

**Run the packaged JAR:**
```bash
java -jar target/spring-boot-demo-0.0.1-SNAPSHOT.jar
```

## Architecture

- **Main Application**: `DemoApplication.java` - Standard Spring Boot application entry point
- **REST Controller**: `HelloController.java` - Contains endpoints:
  - `GET /` - Returns "Hello, Spring Boot!"
  - `GET /health` - Returns "Application is running!"
- **Entity Model**: `Entity.java` - Simple POJO with id, name, and age fields
- **Configuration**: `application.properties` - Application runs on port 8080

## Package Structure

```
com.example.demo/
├── DemoApplication.java    # Main application class
├── HelloController.java    # REST endpoints
└── Entity.java            # Data model
```

## Application Configuration

- Server runs on port 8080 (configurable in `application.properties`)
- Application name: `spring-boot-demo`
- Uses Spring Boot Web starter for REST API functionality
- Uses Spring Boot Test starter for testing framework
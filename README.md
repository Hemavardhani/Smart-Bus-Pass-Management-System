# Smart-Bus-Pass-Management-System
Smart Bus Pass Management System — Backend REST API built with Java 17, Spring Boot 3.5, Spring Data JPA and MySQL. Features pass generation, auto-expiry scheduling, fine management and role-based access control.


A backend REST API for a Smart Bus Pass Management System built using Java 17 and Spring Boot 3.5.

Features:
- User registration and login with role-based access (USER / ADMIN)
- Bus route management
- Digital pass generation with MONTHLY, QUARTERLY and YEARLY plans
- Automatic discount logic (10% quarterly, 20% yearly)
- Auto pass expiry using @Scheduled cron job (runs daily at midnight)
- 7-day expiry alert endpoint
- Fine issuance and payment management
- Full CRUD REST APIs tested via Postman

Tech Stack: Java 17 | Spring Boot 4.0.2 | Spring Data JPA | Hibernate | MySQL 8 | Maven | REST API | Spring web | Validation

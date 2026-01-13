# 🕒 Late Gate Management System

![Project Badge](https://img.shields.io/badge/Project-LateGateSystem-blue)
![Java](https://img.shields.io/badge/Backend-Java-brightgreen)
![Spring Boot](https://img.shields.io/badge/Framework-SpringBoot-orange)
![License](https://img.shields.io/badge/License-Educational-lightgrey)

A **Spring Boot-based web application** to manage **late student entries** in college. Staff can record late arrivals, and admins can view and manage entries through a clean, responsive **dashboard**.  

💡 **Key Idea:** Keep attendance tracking lightweight and easy using **JSON storage**, without a database.

---

## 🚀 Features

### Admin Dashboard
- View all late entries in a structured list.
- Add or manage late entries.
- Toggle **Light/Dark theme** for better accessibility.
- Timestamp entries automatically.

### Staff Interface
- Input **student roll number** and select reason for lateness.
- Predefined reasons:
  - Overslept
  - Transport Delay
  - Medical Appointment
  - Personal Work
  - Other
- Auto-saves entries in JSON files.

### Technology Stack
- **Backend:** Java 17, Spring Boot
- **Frontend:** HTML, CSS, JavaScript
- **Data Storage:** JSON (local storage)
- **Web Server:** Embedded Tomcat
- **Build Tool:** Maven

---

## 🌐 Live Demo
first you clone the file and run backend springboot
You can run the application locally:  
**Local URL:** [http://localhost:8080](http://localhost:8080)  

---

## 🛠 Installation & Run

1. **Clone the repository**
```bash
git clone <repository-url>
2.Navigate to project folder
cd lateentry
3.Run the project using Maven
mvn spring-boot:run
4.Open your browser
http://localhost:8080

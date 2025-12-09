# 🧑‍💼 Job Portal Web Application

A simple **Spring Boot + Thymeleaf** Job Portal web application that allows users to:

- Add new job posts  
- View all job posts  
- View detailed information of each job  

This project demonstrates clear MVC architecture and clean data flow between **Controller → Service → Repository → View**.

---

## 🚀 Features

### ✔ Add a Job
Users can submit:
- Job ID  
- Job Profile  
- Description  
- Required Experience  
- Tech Stack (multiple select)

### ✔ View Job List
Displays all jobs stored in the application (in-memory list).

### ✔ View Job Details
Clicking on a job displays:
- Profile  
- Description  
- Experience required  
- Tech stack used  

---

## 🏗 Architecture Overview

User
↓
Controller (handles URL request)
↓
Service (business logic)
↓
Repository (in-memory data storage)
↓
Service (returns data)
↓
Controller (adds to Model)
↓
Thymeleaf View (renders HTML)



### 📌 Components
- **Model (`JobPost`)** → Represents a job post  
- **Repository (`JobRepo`)** → Stores List<JobPost>  
- **Service (`JobService`)** → Mediates data operations  
- **Controller (`JobController`)** → Handles incoming HTTP requests  
- **Thymeleaf Views** → UI pages

---

## 📂 Project Structure

src/
└── main/
├── java/com/nkoder/JobApp/
│ ├── controller/
│ ├── service/
│ ├── repo/
│ └── model/
└── resources/
├── templates/
│ ├── home.html
│ ├── addjob.html
│ ├── viewalljobs.html
│ └── jobdetails.html
└── static/
├── style.css
└── style1.css



---

## 🔧 Tech Stack

- **Java 17 or 21**  
- **Spring Boot 3 / 4**  
- **Spring MVC**  
- **Thymeleaf**  
- **Bootstrap 5**  
- **Lombok**  
- **Maven**

---

## ▶️ Running the Project

1. Install **JDK 17+**
2. Open project in IntelliJ IDEA  
3. Run:


4. Open browser:

http://localhost:8080/home


---

## 🌐 URL Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/home` | Home page |
| GET | `/viewalljobs` | Show all jobs |
| GET | `/addjob` | Job form page |
| POST | `/handleForm` | Save job data |
| GET | `/job/{id}` | View details of one job |

---

## 📦 Future Enhancements

- Add Database (MySQL + JPA)
- Search / Filter jobs
- Pagination
- Login System (Spring Security)
- Convert frontend to React & expose REST API

---

## 🤝 Contributing

Pull requests and suggestions are welcome!

---


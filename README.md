# 🏎️ F1 Race Analyzer API
Hi! 👋 This is a real-time Formula 1 API I built using **Java Spring Boot**, powered by [OpenF1](https://openf1.org). It fetches live driver data and gives you clean endpoints to explore and filter based on driver number or team.
This project combines my interest in backend development and my love for Formula 1. It gave me a great opportunity to explore real-time API integration using Spring Boot.



## 🚀 Features
- 🔍 Get all current drivers  
  `GET /f1/drivers`
- 🏁 Filter by team 
  `GET /f1/drivers?team=Ferrari`
- 🧑‍✈️ Get a driver by number  
  `GET /f1/drivers/number/44`
- 📘 Swagger UI built-in for interactive testing  
  `http://localhost:8080/swagger-ui.html`


## 🧰 Tech Stack
- Java 17  
- Spring Boot 3.5  
- OpenF1 (public API for real-time F1 data)  
- Swagger (springdoc-openapi)  
- Maven


## 🛠️ How to Run Locally
Clone the project and run it using Maven:
```bash
git clone https://github.com/EshwariPonnamanda/f1-race-analyzer.git
cd f1-race-analyzer
./mvnw spring-boot:run
```

Then visit:

```bash
	•	http://localhost:8080/f1/drivers
	•	http://localhost:8080/swagger-ui.html
```

## 📸 Swagger UI Preview
![ui](https://github.com/user-attachments/assets/c3e6b392-03bb-4671-842d-726d6783bf98)

## 📄 License
MIT — feel free to fork, use, or build on it!

Thanks for checking this out! Feel free to open an issue if you want to suggest a new feature or endpoint.
Eshwari Ponnamanda




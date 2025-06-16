# Database Connectivity in Java

This project demonstrates how to connect a Java application to a MySQL database using JDBC. It retrieves data from a `users_se` table and prints the results to the console.

## 🧾 Overview

The application connects to a MySQL database named `java_database`, executes a `SELECT` query on the `users_se` table, and displays the result set containing user ID, name, email, and gender.

## 📁 Project Structure


```plaintext
database_connectivity_java/
├── bin/
│   └── DatabaseConectivity.class
    └── mysql-connector-java-8.0.28.jar
├── lib/
│   └── mysql-connector-java-8.0.28.jar
├── src/
│   └── DatabaseConectivity.java
└── README.md # Project documentation
```

## 💡 Features

- JDBC MySQL database connectivity
- SQL query execution using `SELECT`
- Console output of queried data
- Proper closing of JDBC resources

## 🛠️ Requirements

- Java Development Kit (JDK 8 or later)
- MySQL Server
- MySQL JDBC Driver (`mysql-connector-java-8.0.28.jar`)
- Terminal or any Java IDE (IntelliJ IDEA, Eclipse, etc.)

## 🗃️ Database Details

- **Database Name:** `java_database`
- **Table Name:** `users_se`
- **Table Schema:**

```sql
CREATE TABLE users_se (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    gender VARCHAR(10)
);
```
## Sample Data:
```bash
INSERT INTO users_se (name, email, gender) VALUES
('Imran Ashraf', 'imran@example.com', 'Male'),
('Ayesha Khan', 'ayesha@example.com', 'Female');
```

## How to Compile and Run

# Step 1: Compile
```bash
javac -cp lib/mysql-connector-java-8.0.28.jar -d bin src/DatabaseConectivity.java
```
# Step 2: Compile
```bash
java -cp "bin:lib/mysql-connector-java-8.0.28.jar" DatabaseConectivity
```


## ⚠️ Important Notes
- Make sure MySQL Server is running.
- Update username and password in the JDBC URL if your credentials differ from root and an empty password.
- Ensure the MySQL JDBC JAR file is present in the lib/ directory.

## 📄 License
This project is licensed under the MIT License.


# 🚀 Selenium Java + Cucumber Automation Framework

## 🔧 Project Overview

This is a robust test automation framework built using:

- **Selenium WebDriver (Java)**
- **Cucumber (BDD)**
- **JUnit 5**
- **Docker for Selenium Grid**
- **Jenkins for CI/CD**
- **Maven** for dependency management

It supports parallel execution, dynamic browser selection, and scheduled test runs via Jenkins.

---

## 📁 Project Structure

```
project-root/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── factory/            # DriverFactory for dynamic driver creation
│   │       └── utils/              # Utility methods (if any)
│   ├── test/
│   │   └── java/
│   │       └── stepdefinitions/    # Cucumber step definition files
│   │       └── runners/            # TestRunner classes (sequential & parallel)
│   │       └── hooks/              # MyHooks for @Before/@After setup
│   │       └── features/           # .feature files for test scenarios
│
├── docker-compose.yml             # Docker Grid config (hub + nodes)
├── Dockerfile                     # (Optional) for custom containers
├── pom.xml                        # Maven project config
├── junit-platform.properties      # JUnit 5 parallel config
└── README.md                      # Project documentation
```

---

## ✅ Features

- **Dropdown automation** with 9 BDD scenarios
- **Parallel execution** using JUnit 5 and `junit-platform.properties`
- **Cross-browser testing** via Dockerized Selenium Grid (Chrome + Firefox nodes)
- **Dynamic browser selection** using Maven command:
  ```bash
  mvn test -Dbrowser=chrome -DrunMode=grid
  ```
- **Scheduled execution via Jenkins**
- **Support for local or grid mode**
- **Thread-safe WebDriver management** using `ThreadLocal`

---

## ⚙️ How to Run Tests

### 🔹 Local Execution

```bash
mvn test -Dbrowser=chrome -DrunMode=local
```

### 🔹 Grid Execution via Docker

#### Step 1: Start Docker Grid
```bash
docker-compose up -d
```

#### Step 2: Run Tests
```bash
mvn test -Dbrowser=firefox -DrunMode=grid
```

> Browser options: `chrome`, `firefox`  
> Run mode options: `local`, `grid`

---

## 📦 Maven Dependencies

Main dependencies in `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.16.1</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.21.0</version>
    </dependency>
    <dependency>
        <groupId>org.junit.platform</groupId>
        <artifactId>junit-platform-suite</artifactId>
        <version>1.10.2</version>
    </dependency>
    <!-- Add others like WebDriverManager, etc. -->
</dependencies>
```

---

## 🧪 Jenkins Integration

- Uses **Windows batch command** in Jenkins to trigger Maven:
  ```bash
  mvn clean test -Dbrowser=chrome -DrunMode=grid
  ```
- Supports **cron-style triggers** for scheduled runs.
- Test results can be archived or emailed.

---

## 🐳 Docker Setup

`docker-compose.yml` example:
```yaml
version: "3"
services:
  selenium-hub:
    image: selenium/hub:4.21.0
    ports:
      - "4444:4444"
  chrome:
    image: selenium/node-chrome:4.21.0
    shm_size: 2gb
    depends_on: [selenium-hub]
    environment:
      - SE_EVENT_BUS_HOST=selenium-hub
  firefox:
    image: selenium/node-firefox:4.21.0
    shm_size: 2gb
    depends_on: [selenium-hub]
    environment:
      - SE_EVENT_BUS_HOST=selenium-hub
```

---

## 🧵 Parallel Execution (JUnit 5)

Set up in `src/test/resources/junit-platform.properties`:
```properties
junit.jupiter.execution.parallel.enabled = true
junit.jupiter.execution.parallel.mode.default = concurrent
```

Ensure thread safety with `ThreadLocal<WebDriver>` in `DriverFactory`.

---

## 📊 Reports

> You can integrate **Allure** or **ExtentReports** easily for HTML reporting.

---

## 💬 Contributing

If you're learning or enhancing the framework:
- Add more test modules (login, payment, forms, etc.)
- Integrate advanced CI/CD (GitHub Actions, DockerHub)
- Improve error handling and logging

---

## 📞 Contact

Created by: **Manoj S**  
svmanoj2312000@gmail.com
Tech Stack: Java, Selenium, Cucumber, JUnit 5, Docker, Jenkins  
Feel free to reach out for suggestions or improvements!

# BlazeDemo Flight Booking Automation Framework
Capstone Project
## Project Overview

This project is an automated testing framework developed for the BlazeDemo flight booking website using Selenium WebDriver, Java, TestNG, Maven, and Extent Reports. The framework automates the complete flight booking workflow, validates successful booking, and generates detailed execution reports.

The framework follows the Page Object Model (POM) design pattern to improve maintainability, scalability, and code reusability.

---

## Features

* Automated end-to-end flight booking flow
* Page Object Model (POM) implementation
* Data-driven testing using Excel files
* TestNG test execution and reporting
* Extent Report integration
* Automatic screenshot capture on test failure
* Reusable utility classes
* Maven dependency management
* Git and GitHub integration

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Apache POI
* Extent Reports
* Git
* GitHub

---

## Project Structure

```text
BlazeDemo_Automation
│
├── src/main/java
│   ├── base
│   │   └── BaseTest.java
│   │
│   ├── pages
│   │   ├── HomePage.java
│   │   ├── ReservePage.java
│   │   └── ConfirmationPage.java
│   │
│   ├── utils
│   │   ├── ConfigReader.java
│   │   ├── ExcelUtils.java
│   │   ├── ExtentManager.java
│   │   ├── ScreenshotUtils.java
│   │   └── WaitUtils.java
│   │
│   └── listeners
│       └── TestListener.java
│
├── src/test/java
│   └── tests
│       └── FlightBookingTest.java
│
├── src/test/resources
│   ├── config
│   │   └── config.properties
│   │
│   └── testdata
│       └── BookingData.xlsx
│
├── test-output
│   ├── ExtentReport.html
│   └── Screenshots
│
├── pom.xml
└── testng.xml
```

---

## Framework Components

### Base Package

The Base package contains common setup and teardown methods.

Responsibilities:

* Browser initialization
* Application launch
* Driver management
* Report initialization
* Browser closure

---

### Pages Package

The Pages package follows the Page Object Model design pattern.

#### HomePage

* Select departure city
* Select destination city
* Search flights

#### ReservePage

* Select available flights

#### ConfirmationPage

* Validate booking confirmation message

---

### Utils Package

#### ConfigReader

Reads configuration values from config.properties.

#### ExcelUtils

Reads test data from Excel files.

#### ScreenshotUtils

Captures screenshots during test failures.

#### WaitUtils

Provides reusable explicit wait methods.

#### ExtentManager

Creates and manages Extent Reports.

---

### Listeners Package

Implements TestNG Listeners to:

* Track test execution
* Capture screenshots on failures
* Log test status
* Improve reporting

---

## Test Execution Flow

```text
Launch Browser
      ↓
Open BlazeDemo Website
      ↓
Select Departure City
      ↓
Select Destination City
      ↓
Find Flights
      ↓
Choose Flight
      ↓
Enter Passenger Details
      ↓
Enter Payment Details
      ↓
Purchase Flight
      ↓
Validate Confirmation Message
      ↓
Generate Extent Report
      ↓
Close Browser
```

---

## Sample Test Data

| From Port | To Port | Name   |
| --------- | ------- | ------ |
| Boston    | Rome    | Kashif |

Additional booking details are supplied through Excel DataProvider integration.

---

## Reporting

The framework generates an Extent Report after execution.

Report includes:

* Test Name
* Execution Status
* Pass/Fail Details
* Execution Time
* Screenshots for Failed Tests
* Environment Information

Report Location:

```text
test-output/ExtentReport.html
```

---

## Sample Execution Result

```text
STARTED : bookFlight
PASSED : bookFlight

===============================================
Default test
Tests run: 1, Failures: 0, Skips: 0
===============================================

===============================================
Default suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================
```

---

## How to Run the Project

### Clone Repository

```bash
git clone <repository-url>
```

### Navigate to Project

```bash
cd BlazeDemo_Automation
```

### Execute Tests

```bash
mvn clean test
```

or

Run testng.xml directly from Eclipse.

---

## Benefits of the Framework

* Modular design
* Easy maintenance
* Scalable architecture
* Reusable components
* Automated reporting
* Reduced manual testing effort
* Improved test reliability

---

## Future Enhancements

* Cross-browser testing
* Jenkins CI/CD integration
* Parallel execution
* Allure Reporting
* Cloud execution using Selenium Grid

---

## Author

Kashif Akhtar

Automation Testing | Selenium WebDriver | TestNG | Java | Maven


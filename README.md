 BlazeDemo Flight Booking Site
Booking Project
Prepared By: Kashif Akhtar
Framework : Selenium + Java+TestNG+Maven+POM

1.	Project Overview
This project is an end-to-end web automation testing framework developed for the BlazeDemo flight booking website using Selenium WebDriver, Java, TestNG, Maven, and Extent Reports. The framework automates the complete flight booking workflow, validates application functionality, captures screenshots on test failure, and generates detailed HTML test execution reports.
2.	Technologies Used
 •  Java 
•  Selenium WebDriver 
•  TestNG 
•  Maven 
•  Extent Reports 
•  Apache Commons IO 
•  Git 
•  GitHub 
•  Eclipse IDE 
•  Google Chrome 
•  ChromeDriver 
•  Page Object Model (POM) Design Pattern 
•  Data Provider (TestNG) 
3.Framework Structure
Base package, pages package, Utils Package, Test package,listeners package,Excel data.
4.Automted Test Flow
1. Launch BlazeDemo Application
2. Search Flights (Boston → London)
3. Select Flight
4. Enter Passenger Details
5. Complete Flight Purchase
6. Validate Confirmation Page
7. Capture Screenshots
8. Write Results into Excel
5. Test Execution Summary
STARTED : bookFlight
PASSED : bookFlight
PASSED: tests.FlightBookingTest.bookFlight("Boston", "Rome", "Kashif", "Delhi", "Delhi", "Delhi", "110001.0", "American Express", "41111111111", "11.0", "2027.0", "Kashif")

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================
Total test executed:1
Passed:1, Failed: 0, Skipped:0, Pass Percentage:100%.
6.Execution Log Highlights
Searching Flights → Selecting Flight → Filling Purchase Details → Final Confirmation Page → Writing Excel Data → Test Completed Successfully.

7. Defects Identified During Testing
-Credit Card field accepts alphabets
-Booking allowed without passenger name
-Expiration year accepts invalid values
-No validation for special character in name field.
-Duplicate booking possible on multiple tasks
BlazeDemo
│
├── src/test/java
│   ├── base
│   ├── listeners
│   ├── pages
│   ├── tests
│   └── utils
│
├── src/test/resources
│   ├── config
│   ├── testdata  
│
├── test-output
│   ├── ExtentReport
│   ├── Screenshots
│   
├── Jenkinsfile
├── pom.xml
├── testng.xml

# AI-Assisted Login Test Automation

## Overview
This project demonstrates the use of an AI tool to generate test cases and automate one test case using Selenium WebDriver with Java.

Website tested: https://www.saucedemo.com  
Feature: Login functionality

---

## AI-Generated Test Cases
AI was used to analyze login requirements and generate the following test cases:
Test Case ID: TC01
Test Case Name: Verify login with valid credentials
Precondition:
•	Application is up and running
•	User is on Login Page
Test Steps:
1.	Open browser
2.	Navigate to login page
3.	Enter username: standard_user
4.	Enter password: secret_sauce
5.	Click Login button
Expected Result:
•	User should be logged in successfully
•	Home page should be displayed
Actual Result:
•	User logged in successfully
Status:  PASS


These test cases helped identify positive and negative scenarios efficiently.

Test Case 2
Test Case ID: TC02
Test Case Name: Verify login with invalid username
Test Steps:
1.	Enter username: invalid_user
2.	Enter password: secret_sauce
3.	Click Login button
Expected Result:
•	Login should fail
•	Error message should be displayed
Actual Result:
•	Login failed as expected
Status: PASS

Test Case 3
Test Case ID: TC03
Test Case Name: Verify login with invalid password
Test Steps:
1.	Enter username: standard_user
2.	Enter password: wrong_password
3.	Click Login button
Expected Result:
•	Login should fail
Actual Result:
•	Login failed
Status:  PASS


Test Case 4 (FAILED ONE – IMPORTANT)
Test Case ID: TC04
Test Case Name: Verify login with problem user
Test Steps:
1.	Enter username: problem_user
2.	Enter password: secret_sauce
3.	Click Login button
Expected Result:
•	Login should fail
Actual Result:
•	Login was successful
Status:  FAIL
Defect:
Application allows login for a user expected to be restricted.


---

## Automated Test

- TC_Login_01 – Valid Login
o	TC01 – Verify login with valid credentials
o	TC02 – Verify login with invalid username
o	TC03 – Verify login with invalid password
o	TC04 – Verify login with problem user


Tool Used:
- Selenium WebDriver
- Java
- JUnit
- Page Object Model (POM)

---

## How AI Helped Test Design
AI helped by:
- Quickly generating multiple test scenarios
- Covering both positive and negative cases
- Reducing manual effort in test design
- Ensuring edge cases like locked users and empty inputs were considered

Automation code was written manually to ensure proper framework structure and maintainability.

---

## Execution Steps

Step 1: Open Project in IDE
•	Open Eclipse / IntelliJ
•	Select File → Open Existing Maven Project
•	Choose the project folder Int_assignment

Explanation:

The project is a Maven-based automation framework, so opening it as a Maven project allows automatic dependency management and proper execution.
Step 2: Verify Project Folder Structure (As Implemented)
Ensure the project structure matches the following layout:
Int_assignment
│
├── pom.xml
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│       ├── java
│       │   └── com
│       │       └── INT
│       │           └── assignment
│       │               ├── base
│       │               │   └── BaseTest.java
│       │               │
│       │               ├── pages
│       │               │   └── LoginPage.java
│       │               │
│       │               ├── tests
│       │               │   └── LoginTest.java
│       │               │
│       │               └── utilit
│       │                   ├── ExcelUtil.java
│       │                   ├── ReportManager.java
│       │                   └── ScreenshotUtil.java
│       │
│       └── resources
│           └── testdata
│               └── LoginData.xlsx
│
├── reports
│   └── ExtentReport.html
│
├── screenshots
│
└── target

________________________________________
 Folder & File Explanation
•	BaseTest.java
Handles browser setup, teardown, and report initialization.
•	LoginPage.java
Page Object Model (POM) class for login actions.
•	LoginTest.java
TestNG test class that runs multiple test cases using Excel data.
•	ExcelUtil.java
Reads test data from LoginData.xlsx.
•	ReportManager.java
Generates Extent HTML reports.
•	ScreenshotUtil.java
Captures screenshots automatically when a test case fails.
•	LoginData.xlsx
External test data source (data-driven testing).
•	reports/
Stores execution report (ExtentReport.html).
•	screenshots/
Stores failure screenshots.
•	target/
Maven-generated build and test output.
________________________________________
 Step 3: Update Maven Dependencies
•	Right-click project
•	Select Maven → Update Project
•	Check Force Update
•	Click OK
Explanation:
This ensures all required dependencies (Selenium, TestNG, Apache POI, Extent Reports) are downloaded and updated correctly.
________________________________________
Step 4: Execute Tests Using Maven (Recommended)
Run the following command from the project root directory:
mvn clean test
Explanation:
•	clean removes previous build files
•	test runs TestNG tests using the Maven Surefire Plugin
This is the standard execution approach used in companies.
________________________________________
Step 5: Execute Tests Using testng.xml (Optional)
•	Navigate to:
•	src/test/resources/testng.xml
•	Right-click → Run As → TestNG Suite
Explanation:
This method allows test execution directly from the IDE for debugging or quick validation.
________________________________________
Step 6: View Test Results
After execution:
•	Execution status (PASS / FAIL) appears in the console
•	Detailed reports are generated at:
•	target/surefire-reports/
Explanation:
These reports provide test execution summary, failures, and stack traces.
________________________________________
Step 7: Analyze Failure (If Any)
If a test case fails:
•	Failure reason is shown in console output
•	Screenshot is automatically captured and stored in:
•	output/screenshots/
Explanation:
Screenshots help identify UI issues and validate failed scenarios, which is a key automation practice.


## How to Run Tests
1. Open project in Eclipse
2. Right-click project → Maven → Update Project
3. Run using:
mvn clean test
OR
Right-click on testng.xml
Select Run As → TestNG Suite
OR
Right-click on LoginTest.java
Select Run As → TestNG Test


## Author
Sofik Shaikh



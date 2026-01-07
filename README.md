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
Status: ❌ FAIL
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
1. Clone the repository
2. Open the project in Eclipse / IntelliJ
3. Update ChromeDriver path if required
4. Run `LoginTest.java`
5. Verify test execution and results

---

## Author
Sofik Shaikh

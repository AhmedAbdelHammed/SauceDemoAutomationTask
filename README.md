# Sauce Demo BM Automation Task  

![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)

This task is for automating some Sauce Demo Website scenarios

### Technologies Used:

- Java
- Selenium WebDriver
- TestNG
- ExtentReport TestNG Adaptor
- WebDriverManager

### Environment Setup - Prerequisites to run the automation test:

- Java installed on the machine
- Maven installed on the machine
Guide to install Maven: https://maven.apache.org/install.html

### Steps to run the automation test:

- Open Terminal or bash and go to the project folder
- Run the below command
    ```sh
    $ mvn clean test
    ```
- To check the test run result open **'testResult\LatestTestRunReport.html'** on any Browser

### Steps to run Headless automation test:

- Open **'config.properties'** file from **'src\main\resources'** folder
- Change **'runHeadless'** to **'true'** and Save
- Then same as above

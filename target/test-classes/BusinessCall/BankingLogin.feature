Feature: Login Functionality

Background: Browsing webpage
When User open browser as "chrome" with exe as 
When User open URL as 

@SmokeTest
Scenario: Login functionality with valid credential
When User enter username as "Admin"
When User enter password as "Admin"
When User click on login button
When User click on branches button
When User select country
When User select state
When User select city
When User click on search button
Then Application shows all branches to user
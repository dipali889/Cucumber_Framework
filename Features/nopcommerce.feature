Feature: All product in catalog

Background: Below are the common steps for each Scenario                  
Given User Launch Chrome browser          
When User open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin"                     
And User entersEmail as "admin@yourstore.com" and Password as "admin"
And Click on Login
Then User can view Dashboard

Scenario: user add new product in catalog
When user clicks on "catalog" section in to dashboard screen
Then verify catalog sub-category list is displayed in the dashboard screen
When user click on "product" section in to dashboard screen




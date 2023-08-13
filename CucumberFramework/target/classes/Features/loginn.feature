Feature: Open CRM Application

#Scenario: CRM Application open
#Given open browser
#When open url
#Then enter "saidurgareddy4121@gmail.com" and "Saidurga@01"   without examples

#Scenario: CRM Application open
#Given open browser
#When open url
#Then enter "<username>" and "<password>"  with examples
#Then click
#
#
#Examples:   
    #| username | password |
    #| Saidurgareddy4121@gmail.com | Saidurga@01 |
    
    

Scenario: CRM Application open
Given open browser
When open url
Then user enters username and password          # using list of data table
| Saidurgareddy4121@gmail.com | Saidurga@01 |
| Saidurga@gmail.com | Saidurg |
Then click
   
#@SmokeTest   
#Scenario: CRM Application open
#Given open browser
#When open url
#Then user enters username and password    
#| username | password|      
#| Saidurgareddy4121@gmail.com | Saidurga@01 |
#| Saidurgareddy412@gmail.com | Saidurga@01 |
#Then click

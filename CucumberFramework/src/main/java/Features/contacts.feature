Feature: Open CRM Application for contacts page

#Scenario: CRM Application open
#Given open browser
#When open url
#Then enter "saidurgareddy4121@gmail.com" and "Saidurga@01"

Scenario: CRM Application open for contacts page
Given open browser
When open url
Then enter "<username>" and "<password>"
Then click login
Then click contact icon
Then user creates "<firstname>" and "<lastname>"


Examples:
    | username | password | firstname | lastname
    | Saidurgareddy4121@gmail.com | Saidurga@01 | admin | admin123
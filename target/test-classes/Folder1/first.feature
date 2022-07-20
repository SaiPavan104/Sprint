
  Scenario: Verifying the login feature
Given Enter the User_id
And User_id must be 8 characters
When Enter the valid password
Then Click on login
And Homepage should be displayed


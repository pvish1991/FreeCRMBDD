Feature: Deal data Creation 

Scenario: Free CRM Create a new deal scenario

Given user is already on login Page
When title of login page is Free CRM
Then user clicks on login link
Then user enters username and password 
|pvish1991@gmail.com | Test@123 |

Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user clicks on create button
Then user enters deal details
| test deal | 50 | 1000 | 100 |

Then Close the browser
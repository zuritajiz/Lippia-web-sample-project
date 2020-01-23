Feature: Initial page
As web user
I want to navigate into PhpTravels
And look into blog page

@Test
 Scenario: As a web user i want to navigate PHPTravels blog page
   Given The user is in home page
   When The user go to Blog page
   Then The Blog page is displayed

Feature: Initial page
As a web user
I want to navigate PhpTravels web page
And search a flight and complete the form.

@Test
 Scenario: As a web user I want to navigate PHPTravel and complete a fligth form
   Given The user is in Flight page
   When The user complete a flight form
   |key|value|
   |Name|Pepito|
   |Surname|Perez|
   Then the form flight fields are completed
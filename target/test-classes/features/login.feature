Feature: Login
  As: A Quality Analyst
  I Want: Validate and verify the functionality of the Login on the site http://thedemosite.co.uk/addauser.php
  To: Have access to the portal

  Scenario Outline: enter the system having the credentials
    Given that Elvis is in the portal
    When he enters the credentials
      | username   | password   |
      | <username> | <password> |
    Then user should see message <username>

    Examples:
      | username        | password     |
      | usuarioLinkedin | Usuario*2019 |
      | usuarioLin      | Usuar*2019   |
Feature: Login
  As: A Quality Analyst
  I Want: Validate and verify the funcionality of the login on the site http://thedemosite.co.uk/savedata.php
  To: Have access to the portal.

  Scenario Outline:  Enter the system having the credentials
    Given that Elvis is in the portal
    When he enters the credentials
      | username   | password   |
      | <username> | <password> |
    Then user should see message <userName>

    Examples:
      | username | password |
      | Elvis    | Elvis*   |


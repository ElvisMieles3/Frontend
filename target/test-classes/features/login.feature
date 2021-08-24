Feature: Login
  As: A Quality Analyst
  I Want: Validate and verify the funcionality of the login on the site http://thedemosite.co.uk/savedata.php
  To: Have access to the portal.

  Scenario Outline:  Enter the system having the credentials
    Given that Elvis is in the portal
    When he enters the credentials
      | username   | password   |
      | <username> | <password> |
    Then user should see message The username:
    Examples:
      | username | password |
      | Elvis    | Elvis*   |


  Scenario Outline:  Message validation when complete data is not sent.
    Given that Elvis is in the portal
    When he enters the credentials
      | username   | password   |
      | <username> | <password> |
    Then user should see the alert message <message>

    Examples:
      | username | password | message                                                                    |
      | Elvis    | E        | Password too short.  The password must be at least 4 characters in length. |
      | E        | Elvis    | Password too short.  The usurname must be at least 4 characters in length. |


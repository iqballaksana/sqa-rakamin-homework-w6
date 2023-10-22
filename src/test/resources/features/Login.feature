@FirstRelease
  Feature: Login functionality

    @Positive
    Scenario Outline: Ensure user succesfully login
      # precondition
      Given user in on saucedemo login page
      # steps
      When user input <username> as username
      And user input <password> as password
      And user click enter
      # expected
      Then user verify <status> login result

      Examples:
        | username        | password      | status  |
        | standard_user   | secret_sauce  | success |

    @Negative
    Scenario Outline: Ensure user failed login
      # preconfition
      Given user in on saucedemo login page
      # steps
      When user input <username> as username
      And user input <password> as password
      And user click enter
      # expected
      Then user verify <status> login result

      Examples:
        | username        | password      | status  |
        | standard_user   | secret_saucee  | failed |

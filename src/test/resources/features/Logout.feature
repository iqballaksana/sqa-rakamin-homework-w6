@FirstRelease
Feature: Logout functionality

  @Positive
  Scenario Outline: Ensure logout succesfully
    # precondition
    Given user in on saucedemo login page
      # steps
    When user input <username> as username
      And user input <password> as password
      And user click enter
    Then user verify <status> login result
    When user click icon react burger
      And user click logout link
      # expected
    Then user redirect to login page

    Examples:
      | username        | password      | status  |
      | standard_user   | secret_sauce  | success |
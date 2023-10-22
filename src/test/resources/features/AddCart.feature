@FirstRelease
Feature: add cart functionality

  @Positive
  Scenario Outline: Ensure cart being add succesfully
    # precondition
    Given user in on saucedemo login page
      # steps
    When user input <username> as username
    And user input <password> as password
    And user click enter
    Then user verify <status> login result

    When user click button add cart
      And user click another button add cart
      And user click icon cart
      # expected
    Then in my cart page will see a product being added

    Examples:
      | username        | password      | status  |
      | standard_user   | secret_sauce  | success |
@FirstRelease
Feature: payment functionality

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
    Then in my cart page will see a product being added

    When user click checkout button
    Then user redirected to checkout page
    When user input <firstname> as firstname
      And user input <last_name> as last_name
      And user input <postal_code> as postal_code
      And user click button continue
    Then user redirected to checkout overview page
    When user click button finish

    # expected
    Then user redirected to complete checkout page


    Examples:
      | username        | password      | status  | firstname | last_name  | postal_code |
      | standard_user   | secret_sauce  | success | iqbal     | laksana   | 11111   |
@US2 @Natali
Feature:
  As a librarian, I want to know the amount of borrowed books

  Scenario Outline: verify the amount of borrowed books
    Given I am in the homepage of the library app
    When I take borrowed books number
    Then borrowed books number information must match with DB
    Examples:
      |  |
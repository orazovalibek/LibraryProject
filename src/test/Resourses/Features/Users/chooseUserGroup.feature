Feature: as a user librarian I should be able to separate user groups

  @librarian_group
  Scenario: separate librarians
    Given user on the login page
    When user logs in as a "librarian"
    And clicks to the "Users" tab
    And choose "Librarian" from Users Group dropdown
    Then user should see only users from "Librarian" group

  @students_group
  Scenario: separate librarians
    Given user on the login page
    When user logs in as a "librarian"
    And clicks to the "Users" tab
    And choose "Students" from Users Group dropdown
    Then user should see only users from "Students" group

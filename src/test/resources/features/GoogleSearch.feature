Feature: Google Searching
  As a web surfer,
  I want to search Google,
  So that I can learn new things.

  Scenario: Simple Google search
    Given a web browser is on the Google page
    When the search phrase "selenide" is entered
    Then results for "selenide" are shown
    And the 1 st result must be "Selenide: concise UI tests in Java"
    And the 2 nd result must be "GitHub - selenide/selenide: Concise UI Tests with Java!"
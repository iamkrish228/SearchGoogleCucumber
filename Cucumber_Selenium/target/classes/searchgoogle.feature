Feature: Search a word in Google

  Background: 
    Given On the Google Search Page

  Scenario: Search a word in Google
    When Type "Ducks" and click on the Search
    Then Check for the Search Results

  Scenario: Verify the Search link
    When Type "Ducks" and click on the Search
    Then Check for the Search Results
    Then Verify the duck search link
    
  #Search for a other word "Eagle" and check if we get the same link (Negative)
  Scenario: Check for a different search word
    When Type "Eagle" and click on the Search
    Then Verify the Other Search Results               

  #Search for a special characters "#$%&" and check if we get the same link (Negative)
  Scenario: Check for a different search word
    When Type "#$%&" special characters and click on the Search
    Then Verify the Other Search Results

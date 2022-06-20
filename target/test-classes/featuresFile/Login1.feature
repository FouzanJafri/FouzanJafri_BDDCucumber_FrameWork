Feature: Test Login 

@Login
  Scenario Outline: Check Login is success
    Given browser is open
    And user click on singIn button is top left corner
    When user enters "<username>" and "<password>"
    And clicks on login
    Then user is naigated to the home page
    #Then window should close
    
        Examples: 
      | username            | password|
      |jafrifouzan@gmail.com|fouzan00!|
      |jafrifouzan@gmail.com|Fouzan00!|
    

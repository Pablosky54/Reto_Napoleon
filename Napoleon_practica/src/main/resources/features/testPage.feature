#Author: cefit.pablo@gmail.com

Feature: Test of page and the functions 
  I want chose differents option in web page

  
  @tag1
  Scenario: I open page
    Given "JuanP" open page
    When I chose option IFrames Test and then chose option Window Open Test       
    Then I verify correct open page 
    
       
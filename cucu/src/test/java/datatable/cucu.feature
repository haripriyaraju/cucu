

Feature: eating fruits
this feature explains about fruits

 


  Scenario Outline: eating
    Given there are "<start>" fruits
    |type|with|
    |apple|me|
    |orange|john|
    |fig|mary|
    When i eat "<eat>" fruits
    Then i have "<left>" furits

    Examples: 
      | start  |eat  | left  |
      | 12 |  5   |7 |
      | 10|   2  |  8 |

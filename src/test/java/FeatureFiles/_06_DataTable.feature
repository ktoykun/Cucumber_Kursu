Feature: Login Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    @Regression
  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton   |

    And User sending the keys in Dialog content

      | nameInput   | kübra   |
      | codeInput   | 1434    |

    And Click on the element in Dialog
         | saveButton   |

    Then Succes message should be displayed

    And User delete item from Dialog Content
      | kübra   |

    Scenario: Create Nationality
      # burayı sonra al

    Scenario: Fee functionality
      And Click on the element in LeftNav
        | setup      |
        | parameters |
        | fees       |

      And Click on the element in Dialog
        | addButton   |

      And User sending the keys in Dialog content
        | nameInput       | kübra |
        | codeInput       | 1434  |
        | integrationCode | 121   |
        | priorityCode    | 112   |

      And Click on the element in Dialog
        | toggleBar    |
        | saveButton   |

      Then Succes message should be displayed

      And User delete item from Dialog Content
        | kübra   |

      Then Succes message should be displayed





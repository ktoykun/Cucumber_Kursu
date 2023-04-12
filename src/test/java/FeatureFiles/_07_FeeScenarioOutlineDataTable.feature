#Senaryo:
  #daha önceki fee func. senaryosunu
  #name, code, intcode ve priority için
  # 5 farklı kombinasyon için çalıştırınız

Feature : Fee multiple values funstionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: Fee functionality
    #outline diyerek bunun birden fazla kez yapılacağını söylemiş olduk. 5 kez çünkü
And Click on the element in LeftNav
| setup      |
| parameters |
| fees       |

And Click on the element in Dialog
| addButton   |

And User sending the keys in Dialog content
#aşağıda yazan tabloyu buraya direkt almış olduk. renkleri değişti
  | nameInput       | <name>     |
  | codeInput       | <code>     |
  | integrationCode | <intcode>  |
  | priorityCode    | <priority> |

And Click on the element in Dialog
| toggleBar    |
| saveButton   |

Then Succes message should be displayed

And User delete item from Dialog Content
| <name>   |

Then Succes message should be displayed
    Examples:
      | name | code | intcode    | priority |
      | küb1 | 123  | paypal     | 1        |
      | küb2 | 456  | debitcard  | 2        |
      | küb3 | 789  | applePay   | 3        |
      | küb4 | 159  | cash       | 4        |
      | küb5 | 951  | creditcard | 5        |


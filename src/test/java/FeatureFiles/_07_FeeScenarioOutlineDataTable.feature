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

And User sending the keys in Dialog Content
#aşağıda yazan tabloyu buraya direkt almış olduk. renkleri değişti
  | nameInput       | <name>     |
  | codeInput       | <code>     |
  | integrationCode | <intcode>  |
  | priorityCode    | <priority> |

And Click on the element in Dialog
| toggleBar    |
| saveButton   |

Then Success message should be displayed

And User delete item from Dialog Content
| <name>   |

Then Success message should be displayed
    Examples:
      | name | code | intcode    | priority |
      | kub1 | 123  | paypal     | 1        |
      | kub2 | 456  | debitcard  | 2        |
      | kub3 | 789  | applePay   | 3        |
      | kub4 | 159  | cash       | 4        |
      | kub5 | 951  | creditcard | 5        |


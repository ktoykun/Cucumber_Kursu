
  #Senaryo
    # Exam Formunun çalışmasını test ediniz
    # 1 sınav girişi yapıp
    # sonrasında silmesini yapınız


  Feature :Exam Form functionality
    Background:
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login succesfully

    Scenario : Exam Create and Delete
    And Click on the element in LeftNav
      | Entrance Exams1 |
      | Setup1          |
      | Entrance Exams2 |

      And Click on the element in Dialog
        | addButton   |

      And User sending the keys in Dialog content
        | nameInput      | Kübra     |

      And Click on the element in Dialog
        | academicPeriod  |
        | academicPeriod1 |
        | gradeLevel      |
        | gradeLevel2     |

      And Click on the element in Dialog
        | saveButton   |

      Then Succes message should be displayed

      #silme işlemi için listeye geri dönmek için yukarıdaki kodu tekrar çalıştırabiliriz.
      #şöyle:
      And Click on the element in LeftNav
        | Entrance Exams1 |
        | Setup1          |
        | Entrance Exams2 |

      And User delete item from Dialog Content
        |    |

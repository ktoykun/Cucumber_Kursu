#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)

Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to CitizenShip page

#Outline konuldugunda Data provider gibi calisir. asagidaki gibi basina <> konurlursa
  #onu algilar
  Scenario Outline: CitizenShip create
    When User a CitizenShip name as "<name>" short name as "<shortname>"
    Then Success message should be displayed

    When User a CitizenShip name as "<name>" short name as "<shortname>"
    Then Already exist message should be displayed

    When User delete the "<name>"

    Examples:
      | name | shortname |
      | kub5 | 1234      |
      | kub6 | 1234      |
      | kub7 | 1234      |
      # 1.satiri aliyor ve o satirdaki veri icin yukaridkai senaryoyu bastan calistirir.
      #Daha sonra 2. satira gecer ve devam eder. yukariya ne gidecegini name ve short
      # yazan baslik kismindan anliyor




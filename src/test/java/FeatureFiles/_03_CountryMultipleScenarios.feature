
  # çoklu senaryo olduğunda her senaryodan ortak çalışacak olan kısmı backgrounda
  # ekleyebiliriz. before class mantığında her SENARYODAN önce çalışır.BeforeSenaryo diyebiliriz.
  # böylecek çift tırnağın gönderilecek bir string olduğunu algılar.

 Feature: Country Multi Scenario
  Background: #beforeScenario her senaryodan önce ortak olarak çalışacak olan kısım
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to setup, parameters and countries

    #ilk senaryoda gönderilecek olan kısım kodun içinde sabit. country stepsin içinde ikincide ise çift tırnak arasında
   #aldığımız parametreyi gönderiyoruz. iki farklı yol var yani.çift tırnağı görünce bu string diyor ve parametrik açılıyor
   #ikinci yol daha kolay kodu değiştirmektense parametreyi değiştirmek daha kolay
    Scenario: Create a country
      When Enter name and code and click + button
      Then country should create succefully

      Scenario: Create a country 2
        When create a country name as "kübükkk" code as "2112"
        Then country should create succefully
Feature: US1001 Kullanıcı testotomasyonu sayfasında ürün aratabilmeli

  Scenario: TC01 Kullanici phone aratabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna phone yazip enter tusuna basar
    Then arama sonucunda ürün bulunabildiğini test eder
    And sayfayi kapatir

    Scenario: TC02 Kullaici dress aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna dress yazip enter tusuna basar
      Then arama sonucunda ürün bulunabildiğini test eder
      And sayfayi kapatir

Scenario: TC03 Kullanci baby aratabilmeli

  Given kullanici testotomasyonu anasayfaya gider
  When arama kutusuna baby yazip enter tusuna basar
  Then arama sonucunda ürün bulunabildiğini test eder
  And sayfayi kapatir





















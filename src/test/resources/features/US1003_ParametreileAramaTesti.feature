Feature: US1003 kullanici parametre olarak verilen ürünün sitede bulundugunu test eder
  # step yazışırken "" içerisine yazılan kelimeler ve int sayılar parametre olarak kabul edilir ve dinamik kod yazılır

  Scenario: TC07 Kullanici parametre ile phone aratabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna "phone" yazip enter tusuna basar
    And 3 saniye bekler
    # burda 3 ü tırnak içine almadım ama sayı olarak yazdığımız her şeyi parametre olarak kanul ediyor
    Then arama sonucunda ürün bulunabildiğini test eder

    And sayfayi kapatir

  Scenario: TC0 Kullanici parametre ile phone aratabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna "apple" yazip enter tusuna basar
    And 5 saniye bekler
    Then arama sonucunda ürün bulunabildiğini test eder
    And sayfayi kapatir

    #birdaha bizden yeni step istemez çünkğ kodu aranacak kelime olarak yazdık

  Scenario: TC09 Kullanici parametre ile Cokokrem arattiğinda sonuç bulunamamli
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna "cokokrem" yazip enter tusuna basar
    Then arama sonucunda ürün bulunamadiğini test eder
    And sayfayi kapatir


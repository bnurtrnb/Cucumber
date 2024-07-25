Feature: US1002 Negatif arama testi
# eğer her seneryo başında belirli adımlar aynı ise bu adımlar ayni ise
  # bu adimleri Background : olarak tanımlayabiliriz başlangıç adımlari için var



  Background:
    Given kullanici testotomasyonu anasayfaya gider
    # çok da mantıklı değil ahmet hoca dedi


  Scenario: TC04 kullanci java arattiğinda sınuç bulunamamali
    When arama kutusuna java yazip enter tusuna basar
    Then arama sonucunda ürün bulunamadiğini test eder
    And sayfayi kapatir

    Scenario: TC05 kullanici nutella arattiğinda sonuc bulunamamli

      When arama kutusuna nutella yazip enter tusuna basar
      Then arama sonucunda ürün bulunamadiğini test eder
      And sayfayi kapatir


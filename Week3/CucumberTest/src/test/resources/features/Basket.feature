Feature: Basket

  Background:
    Given Amazon adresine gidildi


  Scenario Outline: Alışverişi tamamla
    Given '<Menu Name>' bölümüne gidildi
    When Rastgele bir ürüne tıklandı
    And Alışveriş tamamlandı
    Then Giriş sayfasında olduğumuz kontrol edildi
    Examples:
      | Menu Name     |
      | Yeni Çıkanlar |
      | Çok Satanlar  |

  Scenario Outline: Sepete git ve ürün sil
    Given '<Menu Name>' bölümüne gidildi
    When Rastgele bir ürüne tıklandı
    And Sepete gidildi
    And Ürün silindi
    Then Sepetin boş olduğu kontrol edildi
    Examples:
      | Menu Name     |
      | Yeni Çıkanlar |
      | Çok Satanlar  |



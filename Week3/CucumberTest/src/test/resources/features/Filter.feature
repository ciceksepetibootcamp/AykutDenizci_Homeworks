Feature:Filter

  Background:
    Given Amazon adresine gidildi

  Scenario Outline: Fiyat Filtreleme
    Given Arama alanına '<product>' yazıldı
    When '<min>' ve '<max>' degerlere gore filtreleme yapildi
    Then Listelenen urunlerin '<min>' ve '<max>' araliginde oldugu kontrol edildi
    Examples:
      | product    |  | min |  | max |
      | telefon    |  | 0   |  | 100 |
      | bilgisayar    |  | 1000   |  | 2000 |

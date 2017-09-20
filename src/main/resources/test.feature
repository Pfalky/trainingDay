Feature: First Test Feature

  @Test1
  Scenario: Test scenario 1
#    Given Пользователь открывает браузер на странице тестируемого ресурса
  Given Пользователь открывает сайт "https://www.yandex.ru/"
#    When Скачать проект построчно
  When Пользователь находится на странице "Страница поиска"
  When Пользователь (заполняет поле) "Поле для ввода поискового текста" "Cucumber"
    @Attachment

# Консольный магазин ноутбуков

Данный репозиторий реализует консольную фильтрацию ассортимента ноутбуков по критериям.

Класс Laptop содержит атрибуты ноутбуков:
* название,
* объём ОЗУ,
* ЖД,
* операционную систему,
* цвет

Кроме того - конструктор класса, методы управления экземплярами класса:
* геттеры и сеттеры для приватных атрибутов
* метод для строчной записи
* метод для сравнения на идентичность
* метод для хеширования

Класс Shop содержит управляющий метод проекта main, создающий набор экземпляров класса Laptop, а также
содержит внутри методы, которые:
* Предлагает пользователю выбрать фильтры для ноутбуков
* Ищут ноутбуки, подходящие по условиям фильтров
* Выводят соответствия в консоль


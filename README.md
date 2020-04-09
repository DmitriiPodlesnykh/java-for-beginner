# История:

## 09.04.2020
### Что было:
Разобрались со ссылочными типами данных. что такое null значение.

### Что почитать:
https://www.youtube.com/watch?v=7tuK9UgCSjs&t=265s - What is null and a null pointer exception? (Java Tutorial)

## 07.04.2020
### Что было:
Начали разбираться с созданием экземпляров классов. Сравнили статические и не статические поля. Познакомились с конструктором класса.

### Что почитать:
https://vertex-academy.com/tutorials/ru/modifikator-static-v-java/ - модификатор java для полей
https://vertex-academy.com/tutorials/ru/konstruktory-slovo-v-java/ - конструкторы

### Рекомендуется выполнить:
Создать package location. 
1. Создать класс City. Добавить поля 'имя', размер. Создать 7 городов с разными названиями и численностью.
Вывести результаты в консоль.
1. Попробовать склонировать текущий репозиторий себе на локальную машину и запустить примеры.
1.1. Заходим на главную страницу репозитория, нажимаем кнопку clone. Выбираем HTTP ссылку.
1.2. Переходим в Intellij Idea. File->new project->from version contol-> git. В url вставляем ссылку в репозиторий. Создаем. 

## 02.04.20202
### Что было:
Продолжили разбираться с модификаторами доступа, полями и методами класса.

### Что почитать:
Посмотреть как реализованы классы:
java-for-beginner-example\src\main\java\actor\Person.java
java-for-beginner-example\src\main\java\animal\Cat.java
java-for-beginner-example\src\main\java\StartPoint.java

### Рекомендуется выполнить:
В package animal\ создать класс Dog. 
Добавить static поля: порода, кличка, возраст, пол, любимая игрушка(тип String). Каждому из полей присвоить значения по умолчанию.
Добавить методы:
1. public static void gaf() - выводит в консоль любое сообщение от собаки
1. public static String getAge() - возвращает возраст собаки
1. public static void appendYear(int count) - добавляет собаке указанное количество лет. 
Если итоговое значение больше 200, то в консоль выводится сообщение "Что-то здесь не так" и возраст остается прежним.
1. public static boolean guessAge(int[] optionArray) - принимает на вход массив вариантов. 
Если среди этих вариантов есть возраст собаки - возвращать из метода true, иначе false.
Добавить в класс Person метод playWithDog(). Вызвать все методы Dog в этом методе.
1. придумать пару интересных методов самостоятельно

## 31.03.20202
### Что было:
Узнали о модификатарах доступа, пакетах и импортах. Напомнили, что необходимо создать репозиторий на gitHub

### Что почитать:
http://developer.alexanderklimov.ru/android/java/package.php
https://javarush.ru/groups/posts/1988-modifikatorih-dostupa-private-protected-default-public

Для тех, кто хотел бы создать себе репозиторий на GitHub видео, как это можно сделать, не выходя из Intellij Idea
https://www.youtube.com/watch?v=mf2-MOl0VXY

### Рекомендуется выполнить:
Создать пакет lesson20200331. Внутри создать два пакета: actor и object. Внутри actor создать класс Person c методами eat() и drink(). Внурти object создать классы Table, Chair, Sofa. Внутри каждого класса создать метод getHeight() который выводит на экран высоту предмета. В каждом классе должен быть свой модификатор доступа. Попробовать вызвать все классы в main  

## 13.03.2020
### Что было:
Познакомились с массивами
Рассмотрели что такое циклы и как реализован цикл for(int i=0; i<array.length; i++) в Java.

### Что почитать:
https://javarush.ru/groups/posts/for-v-java - цикл for
https://javarush.ru/groups/posts/massivy-java - прочитать про одномерные массивы
http://developer.alexanderklimov.ru/android/java/for.php тоже массивы

### Рекомендуется выполнить:
https://gist.github.com/DmitriiPodlesnykh/63ab0ce1e030e659ba9f2bb0e10cbebd - воспользоваться шаблоном 
и реализовать логику работы методов. Как проверять: Вызывать эти методы в Main#main(в Main классе main метода) и выводить реальтаты в консоль


## 10.03.2020
### Что было:
Узнали, что такое класс. Создали класс Calculate, который содержит методы для арифметических действий с числами.

### Рекомендуется выполнить:
1. Зарегистрироваться на GitHub
1. Дополнить класс Calculator: 
    * Если нет своего, можно воспользоваться https://github.com/DmitriiPodlesnykh/java-for-beginner/blob/11032020/calculator-app/src/Calculator.java
    * добавить метод, который принимает в себя 2 числа типа int и выводит их произведение. 
    * добавить метод, который принимает в себя 2 числа типа int и выводит их разность
1. https://gist.github.com/ - загрузить получившийся класс Calculate на GitHub.Gist и прислать мне ссылку в качестве дз

## 05.03.2020
### Что было:
Потворили if-else оператор
Обсудили методы, аргументы методов. Методы могут быть void или возвращать какое-то значение.
В https://github.com/DmitriiPodlesnykh/java-for-beginner/blob/master/first-app/src/Main.java пример c прошедшего урока

### Что почитать:
http://proglang.su/java/operator-if-else
http://proglang.su/java/methods до "Перегрузка методов"

### Рекомендуется выполнить:
Написать программу, которая проверяет корректность формулы сокращенного умножение: 
(a + b)^2 = a^2 + 2ab + b^2
Можно использовать шаблон программы:
https://gist.github.com/DmitriiPodlesnykh/414f8f930421a57882ae74fe0754fbf4

## 03.03.2020
### Что было:
Установили JDK на компьютер. В Idea создали новый класс, написали и запустили Hello world программу.
Гайд: https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html

## 27.02.2020
### Что было: 
Познакомились с тем, как выглядит java-программа, состоящая из одного метода main, который выводит в консоль "Hello world!"
Начали разбирать простые типы данных. Переменные.

### Что почитать:
1. https://www.youtube.com/watch?v=ziOQ8wkmnSE - Как выглядит простейшая java программа.
1. http://study-java.ru/uroki-java/urok-6-sintaksis-java-peremennye-i-tipy-dannyh/ - Java переменные, Типы данных в java/Примитивные типы данных
1. https://www.youtube.com/watch?v=lmK15qB_r70

### Рекомендуется выполнить:
Установить IntelliJ IDEA Community из https://www.jetbrains.com/idea/download 

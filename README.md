# История:

## 26.05.2020
### Что было:
1. HashSet

### Что почитать:
1. https://javarush.ru/groups/posts/2147-hashset-v-java - HashSet
1. https://www.callicoder.com/java-hashset/ - HashSet
1. https://www.youtube.com/watch?v=WPcKwA5WF7s - HashSet
1. https://habr.com/en/post/168195/ - Разбираемся с hashCode() и equals()

### Рекомендуется выполнить:
Создать класс House, который должен содержать внутри себя следующие поля:
* public Street street //класс Street должен хотя бы содержать поле name
* public int numberOfHouseResidents
* public List<Integer> apartmentNumber
* переопределить toString() метод.

Создать 3 экземпляра класса, два из которых содержат одинаковые значения полей. Добить в коллекцию HashSet.
Вывести на экран список всех входящих в коллекцию значений и ее размер. Убедиться, что выведутся все три дома,
хотя 2 из них будут с одинаковыми значениями. Возмутиться. Переопредеть equals() и hashcode() методы для классов Street и House.
Вывести на экран список всех входящих в коллекцию значений и ее размер.
Размер коллекции будет 2, один из домов дубликатов не добавится.

## 22.05.2020
### Что было:
1. HashCode, Equals
1. String pool

### Что почитать:
1. https://javarush.ru/groups/posts/equals-java-sravnenie-strok
1. https://www.baeldung.com/java-string-pool
1. http://www.quizful.net/interview/java/equals-equality-difference
1. https://www.w3schools.com/java/ref_string_equals.asp
1. https://www.w3schools.com/java/ref_string_hashcode.asp

### Рекомендуется выполнить:
Выбрать/Создать любой класс c 2-4 полями. Переопределить equals&hashcode. Создать несколько экземпляров класса, с разным значением полей.
Сравнить созданные экземпляры класса по hashcode() и equals(). Результаты сравнения вывести на экран. 

## 13.05.2020
### Что было:
1. ArrayList vs LinkedList

### Что почитать:
1. https://www.baeldung.com/java-arraylist-linkedlist - краткое сравнение
1. https://habr.com/en/post/128269/ - очень подробно про ArrayList
1. https://habr.com/en/post/127864/ - очень подробно про LinkedList


### Рекомендуется выполнить:
предыдущую домашку.

## 07.05.2020
### Что было:
1. ArrayList

### Что почитать:
1. https://javarush.ru/groups/posts/klass-arraylist
1. https://www.w3schools.com/java/java_arraylist.asp
1. http://developer.alexanderklimov.ru/android/java/arraylist.php
1. https://vertex-academy.com/tutorials/ru/arraylist-v-java/


### Рекомендуется выполнить:
Создать ArrayList типа Sheep, в который добавить 10 новых овец с именами "1", "2"..."10".
Создать второй ArrayList. Поместить в него все элементы 1 коллекции 
и добавить 3 дополнительных с именами: "101", "102", "103".
Вывести в консоль вторую коллекцию.
Заменить во второй коллекции элементы с индексами с 3 по 7 новыми, с именами "301", "302".. "305".
Вывести в консоль вторую коллекцию.
Заменить во второй коллекции все элементы, имена которых содержат "1" внутри себя на значение "updated".
Вывести в консоль вторую коллекцию.

## 30.04.2020
### Что было:
1. interface

### Что почитать:
1. https://www.w3schools.com/java/java_interface.asp
1. https://javarush.ru/groups/posts/1981-dlja-chego-v-java-nuzhnih-interfeysih
1. https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/

### Рекомендуется выполнить:
Создать класс с домашним заданием. Например IntarfaceLessonHW.
 Добавить метод <code>public static void run()</code>.
Создать интерфейс Repairable с методомами <code>void repair(int cash);</code>
 и <code> boolean isNeedToRepair();</code>
Для классов Street, Plane и Car имплементировать новый интерфейс. Реализовать поведение:
1. В классах Plane и Car создаем переменную <code>boolean isNeedRepair = true;</code>
1. Для Car в методе repair: делаем проверку, если cash > 10, 
выводим сообщение "Отремонтированно" в консоль и меняем значение переменной isNeedRepair, иначе "Не хватает денег"
1. Для Street в методе repair выводим сообщение "Не хватает денег", не зависимо от внесенной суммы.
1. Для Plane: 
- Создаем переменную класса <code>int costOfRepair=500</code> 
-  в методе repair проверяем, хватает ли нам внесенной суммы.
- если хватает, меняем значение переменной isNeedRepair.
- Если не хватает, обновляем значение переменной по формуле costOfRepair = costOfRepair-cash.
Выводим сообщение в консоль, что нужны еще деньги.

В методе класса IntarfaceLessonHW создать массив типа Repairable, поместить несколько Street, Car, Plane. 
В том же методе создать переменную cash = 100000.
Пройтись в цикле по всем объектам и попытаться их отремонтировать.
При каждом ремонте, уменьшать значение переменной сash
 
## 28.04.2020
### Что было:
1. abstract method
1. arrays
1. разбирали дз lesson.TryCatchLesson.filterOnlySheep. Метод реализован.

### Что почитать:
http://developer.alexanderklimov.ru/android/java/abstract.php - абстрактные классы и методы
https://javarush.ru/groups/posts/1973-abstraktnihe-klassih-v-java-na-konkretnihkh-primerakh - абстрактные классы и методы

### Рекомендуется выполнить:
Попробовать сделать предыдущую домашнюю работу.

## 23.04.2020
### Что было:
1. Try-catch-finally
1. instance of
1. Boxing/unboxing(факультативно)

### Что почитать:
https://javarush.ru/groups/posts/2018-kak-rabotaet-operator-instanceof - instanceOf
https://www.w3schools.com/java/java_try_catch.asp - try catch finally(до throws)
http://developer.alexanderklimov.ru/android/java/exception.php - try catch finally(до throws)
https://habr.com/en/post/329498/ Boxing/unboxing(факультативно). Сейчас JDK 8+

### Рекомендуется выполнить:
Проверить, что у вас есть классы Animal, Sheep, Tiger. Если нет - создать.
Написать реализацию методов, которые можно посмотреть в классе TryCatchLesson:
* lesson.TryCatchLesson.filterOnlySheep
* lesson.TryCatchLesson.filterOnlySelectedAnimal
Создать несколько массивов Animal c разным набором данных и для каждого из них вызвать
 реализованные методы. Полученные результаты выполнения методов выводить на экран.


## 21.04.2020
### Что было:
1. Наследование классов
1. Абстрактный класс
1. Переопределение методов

### Что почитать:
https://vertex-academy.com/tutorials/ru/pravila-nasledovaniya-v-java/
https://javarush.ru/groups/posts/1973-abstraktnihe-klassih-v-java-na-konkretnihkh-primerakh
https://www.w3schools.com/java/java_abstract.asp

### Рекомендуется выполнить:
Создать абстрактный класс транспортное средство с методами void drive(), void stop().
Методы выводят сообщение о том, что движение началось и закончилось для транспортного средства.
Создать и унаследовать 3 разных класса: грузовая машина, автомобиль городской, автобус.
Для каждого переоперделить метод drive()


## 16.04.2020
### Что было:
Переопределение методов. Метод equals(Object o)

### Что почитать:
https://www.geeksforgeeks.org/difference-equals-method-java/
https://javarush.ru/groups/posts/equals-java-sravnenie-strok
https://www.youtube.com/watch?v=m7vFGL-N9eY

### Рекомендуется выполнить:
1. В классе Street переопределить метод equals. 
1. Создать массив из 15 улиц, которые могут повторятся.
1. Написать метод, public int checkStreetCopiesCount(Street[] array, Street street),
который количество эквивалентных улиц, найденных в массиве. (использовать цикл for 1 раз).


## 14.04.2020
### Что было:
Дефолтный конструктор. Конструкторы с параматрами. Ключевое слово this. Наследование от метода Object. Метод toString(). 

### Что почитать:
http://developer.alexanderklimov.ru/android/java/object.php - Object.class
https://www.javatpoint.com/understanding-toString()-method - toString()
https://vertex-academy.com/tutorials/ru/konstruktory-slovo-v-java/ - Конструктор
https://javarush.ru/groups/posts/konstruktory-v-java - Еще про конструктор
https://javarush.ru/groups/posts/608-kljuchevoe-slovo-this-v-primerakh - ключевое слово this

### Рекомендуется выполнить:
Реализовать класс Street, явно наследовать от класса Object. Добавить поля name, description, key. реализовать 3 контруктора:
 без аргументов, со всеми агрументами, только с полем name. Перепределить метод toString(). 
 Создать массив с 10 экземплярами класса Street. Вывести информацию о каждой из улиц в консоль, используя метод toString().
  При создании нового экземпляра класса, должно выводиться новое сообщение: "New street in the our city!".

## 09.04.2020
### Что было:
Разобрались со ссылочными типами данных. что такое null значение.

### Что почитать:
https://www.youtube.com/watch?v=7tuK9UgCSjs&t=265s - What is null and a null pointer exception? (Java Tutorial)
https://www.youtube.com/watch?v=nM2QF3r_PCM - ссылочные типы данных

### Рекомендуется выполнить:
Если не создан класс City, то создать. Добавить поле key(по умолчанию "spb"). В методе main создать массив длинной 10 тип City. Заполнить первые 3 элемента экземплярами класса City с именами "msk", "vrn", "spb". Вывести на экран все значения key, присутствующие в массиве.

## 07.04.2020
### Что было:
Начали разбираться с созданием экземпляров классов. Сравнили статические и не статические поля. Познакомились с конструктором класса.

### Что почитать:
https://vertex-academy.com/tutorials/ru/klassy-v-java/ - классы и экземляры классов в java
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
1. public static int getAge() - возвращает возраст собаки
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

# История:

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
<pre><code>
public class Main {
    public static void main(String[] args)
    {
        int a = 1000;
        int b = 2;
        int leftSideResult;
        //leftSideResult = здесь вызываем написанный метод, который считает левую часть и возвращает результат
        int rightSideResult;
        //rightSideResult = здесь вызываем написанный метод, который считает правую часть и возвращает результат
        System.out.println("left side = ");
        System.out.println(leftSideResult);
        System.out.println("right side = ");
        System.out.println(rightSideResult);
        //вот здесь выводим на экран, true ЕСЛИ левая часть равна правой, иначе false
    }

}
</code></pre>

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

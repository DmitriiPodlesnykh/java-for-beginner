package lesson;

import actor.Person;

public class ClassLesson
{
    /**
     * Создание новых классов Cat и Person.
     * Взаимодействие классов друг с другом.
     */
    public static void startLessonExample()
    {
        Person.hiCat();
        Person.changeCatName("Мяу-мяу-мяу-мяу");
        Person.hiCat();
    }
}

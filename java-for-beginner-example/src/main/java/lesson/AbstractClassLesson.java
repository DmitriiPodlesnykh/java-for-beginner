package lesson;

import animal.Animal;
import animal.Sheep;
import animal.Tiger;

public class AbstractClassLesson implements Lesson
{
    public void startLessonExample()
    {
        //Animal animal = new Animal() //invalid

        Animal animalSheep = new Sheep();
        animalSheep.isCanSpeak();

        Animal animalTiger = new Tiger();
        animalTiger.isCanSpeak();
    }
}

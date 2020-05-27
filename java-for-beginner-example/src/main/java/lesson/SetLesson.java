package lesson;

import animal.Dog;

import java.util.HashSet;

public class SetLesson implements Lesson, CheckBoolean
{

    public boolean returnTrue()
    {
        return true;
    }

    @Override
    public void startLessonExample()
    {
        HashSet<Dog> hashSet = new HashSet();

        hashSet.add(new Dog(20, 20)); //1
        hashSet.add(new Dog(6, 6)); //2

        hashSet.add(new Dog(20, 6));//3
        hashSet.add(new Dog(20, 6));//3

        hashSet.add(new Dog(2108, 1));//3100
        hashSet.add(new Dog(279, 60));//3100


        for (Dog ourDog : hashSet)
        {
            System.out.println(ourDog);
        }
        System.out.println(hashSet.size());
    }
}

package lesson;

import animal.Dog;
import object.House;
import object.Street;

import java.util.HashSet;
import java.util.Set;

public class HashSetLesson implements Lesson
{
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

//
//        for (Dog ourDog : hashSet)
//        {
//            System.out.println(ourDog);
//        }
//        System.out.println(hashSet.size());

        hw();
    }

    private void hw()
    {
        House houseLenin = new House();
        houseLenin.street = new Street("Ленинский проспект");

        House housePushkin = new House();
        housePushkin.street = new Street("Пушкинская");
        System.out.println("housePushkin.hashCode() =" + housePushkin.hashCode());

        House housePushkin2 = new House();
        housePushkin2.street = new Street("Пушкинская");
        System.out.println("housePushkin2.hashCode() =" + housePushkin2.hashCode());

        Set<House> houses = new HashSet<>();
        houses.add(houseLenin);
        houses.add(housePushkin);
        houses.add(housePushkin2);

        System.out.println(houses);
        System.out.println(houses.size());




        System.out.println("________________________________");

        Street street = new Street("d");
        Street street1 = new Street("d");
        Object o = new Object();
        Object o1 = new Object();

        Street street10 = new Street("пушкинская");
        Street street11 = new Street("Пушкинская");

        System.out.println(street10.hashCode() + " " + street11.hashCode());

        System.out.println(
                street.hashCode() +
                        " " + street1.hashCode() +
                        " " + o.hashCode() +
                        " " + o1.hashCode());

        System.out.println("________________________________");


        Street street2 = new Street("васил");

        System.out.println(street2);

    }
}

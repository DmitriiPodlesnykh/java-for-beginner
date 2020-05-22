package lesson;

import animal.Dog;

import java.time.LocalDate;
import java.util.Date;

public class EqualsHashCodeLesson implements Lesson
{
    private LocalDate updateDate = LocalDate.of(2020, 5, 21);

    @Override
    public void startLessonExample()
    {
        hahCodeExample();
        equalsExample();
        collisionExample();
    }

    private void hahCodeExample()
    {
        System.out.println("hahCodeExample: ");
        Dog dog = new Dog();
        Dog dogSecond = new Dog(4, 2);
        Dog dogThird = new Dog(2, 4);

        System.out.println(dog.hashCode());
        System.out.println(dogSecond.hashCode());
        System.out.println(dogThird.hashCode());
    }

    private void equalsExample()
    {
        System.out.println("equalsExample: ");
        Dog dog1 = new Dog(4, 2);
        Dog dog2 = new Dog(2, 4);
        Dog dog3 = new Dog(2, 4);

        System.out.println(dog1.equals(dog2));
        System.out.println(dog2.equals(dog3));
    }

    private void collisionExample()
    {
        System.out.println("collisionExample: ");
        Dog dog1 = new Dog(2108, 1);
        System.out.println("dog 1 hash = " + dog1.hashCode());

        Dog dog2 = new Dog(279, 60);
        System.out.println("dog 2 hash = " + dog2.hashCode());

        boolean areHashCodesTheSame = dog1.hashCode() == dog2.hashCode(); //3100
        System.out.println("dog1.hashcode() == dog2.hashcode() ?  = " + areHashCodesTheSame); // true
        System.out.println("dog1.equals(dog2) ?  = "  + dog1.equals(dog2)); // false
    }
}

package lesson;

import animal.Sheep;
import animal.Tiger;

public class EqualsLesson
{
    /**
     * .equals(Object o) vs ==
     */
    public static void startLessonExample()
    {
        Sheep sheep = new Sheep();

        Sheep sheep2 = sheep;
        System.out.println("same link. equals result: " + sheep.equals(sheep2));
        System.out.println("same link. == result: " + sheep.equals(sheep2));

        System.out.println("null case result: " + sheep.equals(null));

        Tiger tiger = new Tiger();
        System.out.println("Diff types result: " + sheep.equals(tiger));

        Sheep newSheep = new Sheep();
        System.out.println("diff objects with same fields value equals result: " +sheep.equals(newSheep));
        System.out.println("diff objects with same fields value == result: " + (sheep == newSheep));
    }
}

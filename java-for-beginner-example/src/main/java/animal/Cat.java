package animal;

import object.MoveObject;

public class Cat implements MoveObject
{

    private static int weight = 100;

    public static String name = "Барсик";

    public int currentDistance = 0;

    public static void drink()
    {
        System.out.println("Cat drink");
    }

    public static void eat(int countTimes)
    {
        for (int i=0; i< countTimes; i++)
        {
            System.out.println("Cat eat . Current weight = " + weight);
            weight = weight + 1;
        }
    }

    public static int showWeight()
    {
        int currentWeight = weight;
        return currentWeight;
    }

    @Override
    public void move(final int distance)
    {
        currentDistance = currentDistance + distance;
        ///
    }

    @Override
    public int getDistance()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "Cat{"
        + "name = " + name
        + "current distane = " + currentDistance
                + "}";
    }
}

package animal;

public class Cat {

    private static int weight = 100;

    public static String name = "Барсик";

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
}

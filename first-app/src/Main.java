public class Main {

    public static int sum2Values(int firstArg, int secondArg)
    {
        return firstArg + secondArg;
    }

    public static void main(String[] args)
    {
        int actualSum;
        actualSum = sum2Values(2, 10);
        int expectedSum = 10;
        if (actualSum == expectedSum)
        {
            System.out.println("true case");
        }
        else
        {
            System.out.println("false case");
        }
    }

}

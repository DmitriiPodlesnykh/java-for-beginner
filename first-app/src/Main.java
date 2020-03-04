public class Main
{
    public static void main(String[] args)
    {
        boolean thisIsLongNameForBooleanVariable;
        thisIsLongNameForBooleanVariable = true;

        String resultValue = "dafault result string value";

        if(thisIsLongNameForBooleanVariable)
        {
            resultValue = "This is is our new string value";
            System.out.println(resultValue);
        }
        else
        {
            System.out.println(resultValue);
        }
    }
}

package actor;

import animal.Cat;

public class Person {

    public static void hiCat()
    {
        System.out.println("Hi " + Cat.name);
    }

    public static void changeCatName(String myFavoriteName)
    {
        Cat.name = myFavoriteName;
    }
}

import actor.Person;
import animal.Cat;

public class StartPoint
{
    public static void main(String[] args) {
        int currentCatWeight = Cat.showWeight();
        System.out.println(currentCatWeight);

        Person.hiCat();
        Person.changeCatName("Мурка");
        Person.hiCat();

        Cat.drink();
        Cat.eat(3);
    }
}

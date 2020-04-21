package lesson;

import animal.Animal;
import animal.Sheep;
import animal.Tiger;
import object.City;
import object.Street;

public class InheritLesson
{

    public static void startLessonExample()
    {
        Sheep sheep = new Sheep();
        sheep.drink();
        sheep.eat();
        sheep.run();
        sheep.doIt();

        Animal animal = new Sheep();
        animal.eat();
        animal.run();
        animal.drink();


        Animal animal1 = new Tiger();

        // не связанный пример
        // Используется массив экземпляров классов Street как поле экземпляра класса City
        exampleCityFields();
    }

    private static void exampleCityFields()
    {
        Street street1 = new Street("Кольцовская");
        Street street2 = new Street("Кирова");

        Street[] array = new Street[] { street1, street2 };

        City voronezh = new City("Voronezh", array);

        System.out.println(voronezh.toString());
    }
}

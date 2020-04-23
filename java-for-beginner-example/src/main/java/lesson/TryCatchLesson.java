package lesson;

import animal.Animal;
import animal.Sheep;
import animal.Tiger;

public class TryCatchLesson
{
    /**
     * Main method.
     */
    public static void startLessonExample()
    {
        Animal[] animals = new Animal[] {
                new Tiger(),
                new Sheep(),
                new Sheep("name 1234") };
        speakWithAnimals(animals);
    }

    /**
     * Для каждого элемента массива
     * обращаемся корректно в строке speakWithAnimalWithInstanceOf(animal);
     * обращаемся не очень корректно в try-catch блоке в строке speakWithAnimalWithTryCatch(animal), но обрабатываем корректно.
     *
     * @param animals массив и Tiger и Sheep
     */
    private static void speakWithAnimals(Animal[] animals)
    {
        for (int i = 0; i < animals.length; i++)
        {
            Animal animal = animals[i];
            System.out.println("----------- Start speak with animal  = " + animal + "-----------");
            speakWithAnimalWithTryCatch(animal);
            speakWithAnimalWithInstanceOf(animal);
        }
    }

    /**
     * Принимаем Animal. Корректно проверяем, если Tiger, то здороваемся, если Sheep - здороваемся и выполняем уникальный метод doIt
     *
     * @param animal абстрактный класс.
     */
    private static void speakWithAnimalWithInstanceOf(Animal animal)
    {
        if (animal instanceof Sheep)
        {
            Sheep sheep = (Sheep)animal;
            sheep.doIt();
            System.out.println("Hi sheep = " + sheep);
        }
        if (animal.getClass() == Tiger.class)
        {
            Tiger tiger = (Tiger) animal;
            System.out.println("Hi tiger = " + tiger);
        }
    }

    /**
     * Принимаем Animal.
     * Eсли Sheep - здороваемся и выполняем уникальный метод doIt.
     * Eсли Tiger, то падаем из try block в catch block и корректно обрабатываем исключение
     *
     * @param animal абстрактный класс.
     */
    private static void speakWithAnimalWithTryCatch(Animal animal)
    {
        try
        {
            Sheep sheep = (Sheep)animal;
            sheep.doIt();
            System.out.println("Hi sheep = " + sheep);
        }
        catch (ClassCastException exception)
        {
            System.out.println("Все уронили.Message = " + exception.getMessage());
            System.out.println();
        }
        finally
        {
            System.out.println("finnaly");
        }
    }
}

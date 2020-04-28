package lesson;

import animal.Animal;
import animal.Sheep;
import animal.Tiger;

import java.util.Arrays;

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

        Sheep[] result = filterOnlySheep(animals);
        System.out.println(Arrays.toString(result));
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

    /**
     * Фильруем массив, возвращаем новый массив содержащий только экземпляры класса Sheep.
     *
     * @param animals массив потомков Animal. Может содержать Tiger и Sheep.
     * @return массив содежащий только экземпляры класса Sheep из массива.
     */
    public static Sheep[] filterOnlySheep(Animal[] animals)
    {
        Sheep[] result = new Sheep[0];

        for (Animal animal :animals)
        {
            if(animal instanceof Sheep)
            {
                result = prepareNewArray(result);
                Sheep sheep = (Sheep)animal;
                result[result.length-1] = sheep;
            }
        }
        return result;
    }

    private static Sheep[] prepareNewArray(Sheep[] oldArray)
    {
        Sheep[] result = new Sheep[oldArray.length+1];
        for (int j = 0; j<oldArray.length; j++)
        {
            result[j] = oldArray[j];
        }
        return result;
    }

    /**
     * Определяем, какое животное нам прислали вторым аргументом, фильтруем массив элементов, исключая животных других типов.
     * + в конце добавляем новое животное.
     *
     * @param animals массив потомков Animal. Может содержать Tiger и Sheep.
     * @param newAnimal новое животное
     *
     * @return массив содежащий только экземпляры класса Sheep или Tiger из массива + новый элемент.
     */
    public static Animal[] filterOnlySelectedAnimal(Animal[] animals, Animal newAnimal)
    {
        //if (newAnimal.getClass() == animal.getClass())
        return null;
    }
}

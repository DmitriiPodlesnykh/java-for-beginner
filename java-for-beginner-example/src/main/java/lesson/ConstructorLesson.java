package lesson;

import animal.Sheep;

public class ConstructorLesson
{
    /**
     * Создаем экземпляры класса Sheep через разные конструкторы.
     */
    public static void startLessonExample()
    {
        Sheep[] sheepArray = new Sheep[4];

        Sheep sheepDolly = new Sheep("Dolly", 5);
        sheepArray[0] = sheepDolly;

        sheepArray[1] = new Sheep("Dolly clone one");

        sheepArray[2] = new Sheep("Dolly clone two", 3);

        sheepArray[3] = new Sheep();

        for (int i = 0; i < sheepArray.length; i++)
        {
            // неявно выполняется sheepArray[i].toString();
            System.out.println(sheepArray[i]);
        }

    }
}

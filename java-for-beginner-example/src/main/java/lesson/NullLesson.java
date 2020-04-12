package lesson;

import animal.Tiger;

public class NullLesson
{
    /**
     * Создаем массив типа Tiger на 4 позиции.
     * Заполняем 1, 2, 4 экземплярами класса Tiger. 3 остается null.
     *
     * В первом цикле задаем всем не null тиграм имена.
     * Во втором выводим имена всех тигров. Но если у нас null в массиве, то выводим, вместо имени, что Tiger is null
     *
     */
    public static void startLessonExample()
    {
        Tiger [] tigerArray = new Tiger[4];// all 4 values are null
        tigerArray[0] = new Tiger();
        tigerArray[1] = new Tiger();
        // tigerArray[2] is null by default
        tigerArray[3] = new Tiger();

        // 3/4 values non null
        for (int i = 0; i< tigerArray.length; i++)
        {
            Tiger currentTiger = tigerArray[i];
            System.out.println(currentTiger);

            if(currentTiger != null) // prevent Null Pointer Exception
            {
                currentTiger.name = "степан" + i;
                System.out.println(currentTiger.name);
            }
        }

        for (int i = 0; i< tigerArray.length; i++)
        {
            Tiger currentTiger = tigerArray[i];
            if (currentTiger == null)
            {
                System.out.println("Tiger is null");
            }
            else
            {
                System.out.println(currentTiger.name);
            }
        }
    }
}

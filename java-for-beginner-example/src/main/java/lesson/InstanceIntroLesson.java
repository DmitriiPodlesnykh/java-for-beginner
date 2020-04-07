package lesson;

import animal.Tiger;

public class InstanceIntroLesson
{

    /**
     * Рассматривается отличие static полей и методов.
     * Создаем экземпляры тигров.
     *
     */
    public static void startLessonExample()
    {
        System.out.println("Currect tiger counter = " + Tiger.tigerCounter);

        Tiger tiger = new Tiger();
        System.out.println("Currect tiger counter = " + Tiger.tigerCounter);

        System.out.println("tiger counter = " + tiger.getCurrentCounter());
        System.out.println("tiger name = " + tiger.name);
        tiger.addOneMore();
        tiger.name = "Маруся";
        System.out.println("tiger counter = " + tiger.getCurrentCounter());
        System.out.println("tiger name = " + tiger.name);

        Tiger anotherTiger = new Tiger();
        System.out.println("Currect tiger counter = " + Tiger.tigerCounter);

        System.out.println("another tiger counter = " + anotherTiger.getCurrentCounter());
        System.out.println(anotherTiger.name);

        Tiger a1 = new Tiger();
        Tiger a2 = new Tiger();
        Tiger a3 = new Tiger();

        for (int i = 0; i<1000000000; i++)
        {
            Tiger a = new Tiger();
        }

        System.out.println("Currect tiger counter = " + Tiger.tigerCounter);
    }
}

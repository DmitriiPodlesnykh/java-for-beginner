package lesson;

import animal.Cat;

import java.util.ArrayList;

public class ArrayListLesson
{
    public static void startLessonExample()
    {
        diffExample();
        arrayListConstructorExample();
        arrayListBasicMethods();
    }

    private static void arrayListConstructorExample()
    {
        ArrayList arrayList = new ArrayList();
        ArrayList<Cat> catArrayList2 = new ArrayList<>(arrayList);
    }

    private static void arrayListBasicMethods()
    {
        ArrayList<Cat> catArrayList = new ArrayList<>();
        catArrayList.add(new Cat());
        catArrayList.add(10, new Cat());

        ArrayList<Cat> anotherArrayList = new ArrayList<>();
        catArrayList.addAll(anotherArrayList);
    }

    private static void diffExample()
    {
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList + " " + arrayList.size());
        arrayList.add(new Cat());
        System.out.println(arrayList + " " + arrayList.size());
        for (int i = 0; i<1000000; i++)
        {
            arrayList.add(new Cat());
        }
        System.out.println(arrayList.size());


        Object[] objects = new Object[2];
        objects[0] = new Object();
        for (int i = 0; i< 100000; i++)
        {
            Object[] oldAArray = objects;
            objects = new Object[oldAArray.length +1];
            for (int j = 0; j<oldAArray.length; j++)
            {
                objects[j] = oldAArray[j];
            }
            objects[objects.length-1] = new Object();
            System.out.println(objects.length);
        }
        System.out.println(objects.length);
    }


}

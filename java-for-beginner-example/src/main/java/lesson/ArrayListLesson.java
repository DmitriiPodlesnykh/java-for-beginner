package lesson;

import animal.Cat;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLesson implements Lesson
{
    public void startLessonExample()
    {
        classInstanceDiffExample();
        diffExample();
        arrayListConstructorExample();
        arrayListBasicMethods();

        arrayListGetExample();
    }

    private static void arrayListConstructorExample()
    {
        ArrayList arrayList = new ArrayList();
        ArrayList<Cat> catArrayList2 = new ArrayList<>(arrayList);

        int[] a = new int[10];
        ArrayList arrayList3 = new ArrayList(Arrays.asList(new int [10]));
    }

    private static void arrayListBasicMethods()
    {
        ArrayList<Cat> catArrayList = new ArrayList<>();
        catArrayList.add(new Cat());
        //catArrayList.add(10, new Cat());

        ArrayList<Cat> anotherArrayList = new ArrayList<>();
        anotherArrayList.addAll(catArrayList);
        anotherArrayList.addAll(catArrayList);
        anotherArrayList.addAll(catArrayList);

        System.out.println("anotherArrayList.size() = " + anotherArrayList.size());
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
        for (int i = 0; i< 100; i++)
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

    private static void arrayListGetExample()
    {
        ArrayList<Cat> list = new ArrayList<>();

        Cat ourFavoriteCat = new Cat();
        ourFavoriteCat.move(100);

        list.add(ourFavoriteCat);
        list.add(new Cat());

        Object o = list.get(1);
        Cat cat1 = (Cat)o;

        cat1.name = "Виталик";


        for (int i=0; i<list.size(); i++)
        {
            Cat cat = list.get(i);
            System.out.println(cat);
        }

        for (Cat cat : list)
        {
            System.out.println(cat);
        }

        System.out.println("list.contains(ourFavoriteCat) = " + list.contains(ourFavoriteCat));

        Cat anotherCat = new Cat();

        System.out.println("list.contains another cat = " + list.contains(anotherCat));

        System.out.println("list.indexOf(ourFavoriteCat) = " + list.indexOf(ourFavoriteCat));

        list.trimToSize();
    }

    private static void classInstanceDiffExample()
    {
        Cat cat = new Cat();

        Cat cat1 = new Cat();
        cat1.currentDistance = 100;
        cat1.name = "Виталик";


        Cat cat2= new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        ArrayList<Cat> catArrayList = new ArrayList<>();
        catArrayList.add(cat);
        catArrayList.add(cat1);
        catArrayList.add(cat2);
        catArrayList.add(cat3);
        catArrayList.add(cat4);
        catArrayList.add(cat5);

        for (Cat currentCat : catArrayList)
        {
            System.out.println(currentCat.toString() );
        }

        System.out.println("---------------------------------");
    }


}

package lesson;

import animal.Tiger;

public class NullLesson
{
    public static void startLessonExample()
    {
        Tiger [] tigerArray = new Tiger[]{new Tiger(), new Tiger(), null, new Tiger()};
        for (int i = 0; i< tigerArray.length; i++)
        {
            Tiger currentTiger = tigerArray[i];
            System.out.println(currentTiger);

            if(currentTiger != null)
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
            else {
                System.out.println(currentTiger.name);
            }
        }

//        Tiger tiger1 = null;
//        tiger1= new Tiger();
//
//        System.out.println("Tiger 1 = " + tiger1);
//        System.out.println("Tiger 2 = " + null);
//        System.out.println("Null  = " + null);

//        System.out.println(tiger1.name);
//        System.out.println(tiger2.name);


        int [] array = new int[]{1, 23213, 3213, 23};
        //
        //        for (int i = 0; i< array.length; i++)
        //        {
        //            System.out.println(array[i]);
        //        }
    }
}

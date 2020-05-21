package lesson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetLesson implements Lesson, CheckBoolean
{
    public void a()
    {

    }

    public boolean returnTrue()
    {
        return true;
    }

    @Override
    public void startLessonExample()
    {
        Set set = new HashSet();


        HashSet hashSet = new HashSet();
        TreeSet treeSet = new TreeSet();





        List list = new ArrayList();
        list.add("fefefef");
        list.size();



        LinkedList list1 = new LinkedList();
        list1.add(null);
        list1.getLast();



        ArrayList list2 = new ArrayList();

        list2.add("dfffdf");
        list2.trimToSize();

    }
}

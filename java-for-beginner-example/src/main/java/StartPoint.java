import lesson.CheckBoolean;
import lesson.Lesson;
import lesson.SetLesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс содержащий main метод.
 */
public class StartPoint
{
    /**
     * Начало выполнения программ.
     * <p>
     * В этом методе вызываются классы-уроки-примеры.
     * <p>
     * Вариант использования:
     * Выбираем интересующий класс, остальные комментируем.
     *
     * @param args массив входящих параметров.
     */
    public static void main(String[] args)
    {

        List<Lesson> lessonList = prepareLessonList();

        for(Lesson lesson : lessonList)
        {
            lesson.startLessonExample();
        }

        SetLesson setLesson = new SetLesson();

        Lesson lesson = new SetLesson();
        lesson.startLessonExample();

        CheckBoolean checkBoolean = new SetLesson();
        checkBoolean.returnTrue();

        //ClassLesson.startLessonExample(); //02.04.2020
        //InstanceIntroLesson.startLessonExample(); //07.04.2020
        //NullLesson.startLessonExample();//09.04.2020
        //ConstructorLesson.startLessonExample();
        //EqualsLesson.startLessonExample();
        //InheritLesson.startLessonExample();

        //TryCatchLesson.startLessonExample();
        //AbstractClassLesson.startLessonExample();
        //InterfaceLesson.startLessonExample();
        //ArrayListLesson.startLessonExample();

        //ПримерЗакоментированогоУрокаЧтоБыОнНеВыполнялся.startLessonExample()
    }

    private static List<Lesson> prepareLessonList()
    {
        List<Lesson> lessonList = new ArrayList<>();
        //lessonList.add(new AbstractClassLesson());
        //lessonList.add(new ArrayListLesson());
        lessonList.add(new SetLesson());
        return lessonList;
    }

}

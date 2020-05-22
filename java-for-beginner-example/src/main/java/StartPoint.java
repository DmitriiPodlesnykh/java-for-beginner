import lesson.CheckBoolean;
import lesson.EqualsHashCodeLesson;
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
    }

    private static List<Lesson> prepareLessonList()
    {
        List<Lesson> lessonList = new ArrayList<>();
        //lessonList.add(new AbstractClassLesson());
        //lessonList.add(new ArrayListLesson());
        //lessonList.add(new SetLesson());
        lessonList.add(new EqualsHashCodeLesson());
        return lessonList;
    }

}

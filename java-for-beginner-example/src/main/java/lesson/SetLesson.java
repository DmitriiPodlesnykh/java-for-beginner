package lesson;

public class SetLesson implements Lesson, CheckBoolean
{

    public boolean returnTrue()
    {
        return true;
    }

    @Override
    public void startLessonExample()
    {
        HashSetLesson hashSetLesson = new HashSetLesson();
        hashSetLesson.startLessonExample();
    }
}

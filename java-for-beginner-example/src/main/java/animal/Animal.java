package animal;

public abstract class Animal
{

    public Animal()
    {
        super();
        System.out.println("Animal constructor");
    }


    public void eat()
    {
        System.out.println("animal eat");
    }

    public void drink()
    {
        System.out.println("animal drink");
    }

    public void run()
    {
        System.out.println("animal run");
    }

    public abstract boolean isCanSpeak();
}

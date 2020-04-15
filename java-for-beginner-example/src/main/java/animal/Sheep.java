package animal;

/**
 * Наследник класса Object. Как и все классы неявно в java.
 */
public class Sheep extends Object
{
    private String name = "default name";

    private int countLegs = 4;

    public Sheep()
    {
        System.out.println("Hi!!");
    }

    public Sheep(String newName, int countLegs)
    {
        this(newName);
        this.countLegs = countLegs;
    }

    public Sheep(String newName)
    {
        this();
        name = newName;
    }

    /**
     * Переопределеный метод
     *
     * @return данные об экземпляре класса в удобном для человека виде.
     */
    public String toString()
    {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", countLegs=" + countLegs +
                '}';
    }
}

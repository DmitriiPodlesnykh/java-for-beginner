package animal;

import java.util.Objects;

/**
 * Наследник класса Object. Как и все классы неявно в java.
 */
public class Sheep extends Animal
{
    private String name = "sheep default name";

    private int countLegs = 4;

    public Sheep()
    {
        super();
        System.out.println("Hi!! Sheep constructor");
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

    public boolean equals(final Object o)
    {
        System.out.println("current object = " + this.toString() + "; parameter object == " + o);
        if (this == o)
        {
            System.out.println("links equals");
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            System.out.println("parameter 0 = " + o);
            return false;
        }

        final Sheep sheep = (Sheep)o;
        if (this.countLegs == sheep.countLegs && Objects.equals(this.name, sheep.name))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void drink()
    {
        System.out.println("sheep drink");
    }

    @Override
    public boolean isCanSpeak()
    {
        return true;
    }

    public void drink(String a)
    {

    }

    public void doIt()
    {
        System.out.println("doIT");
    }
}

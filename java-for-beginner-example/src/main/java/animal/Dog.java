package animal;

import java.util.Objects;

public class Dog
{
    public int collar = 0;

    public int age = 0;

    public Dog()
    {
    }

    public Dog(final int collar, final int age)
    {
        this.collar = collar;
        this.age = age;
    }

    @Override
    public boolean equals(final Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        final Dog dog = (Dog)o;
        return collar == dog.collar &&
                age == dog.age;
    }

    @Override
    public int hashCode()
    {
        //return 12321312;
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + collar;
        return result;//961
       //return Objects.hash(collar, age);
    }

}

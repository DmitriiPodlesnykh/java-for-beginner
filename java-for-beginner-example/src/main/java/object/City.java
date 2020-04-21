package object;

import java.util.Arrays;

public class City
{
    private String name;

    private Street[] streetArray;

    public City(final String name, final Street[] streetArray)
    {
        this.name = name;
        this.streetArray = streetArray;
    }

    @Override
    public String toString()
    {
        return "City{" +
                "name='" + name + '\'' +
                ", streetArray=" + Arrays.toString(streetArray) +
                '}';
    }
}

package object;

import java.util.Objects;

public class House
{
    public Street street;

    //public int numberOfHouseResidents;

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
        final House house = (House)o;
        return Objects.equals(street, house.street);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(street);
    }
}

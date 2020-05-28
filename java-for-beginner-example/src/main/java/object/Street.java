package object;

import java.util.Objects;

public class Street extends Object
{
    private String name;

    public String description;

    public int size;

    public Street(String streetName)
    {
        super();
        this.name = streetName;
    }

    @Override
    public String toString()
    {
        return "Street{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                '}';
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
        final Street street = (Street)o;
        return size == street.size &&
                Objects.equals(name, street.name) &&
                Objects.equals(description, street.description);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, description, size);
    }
}

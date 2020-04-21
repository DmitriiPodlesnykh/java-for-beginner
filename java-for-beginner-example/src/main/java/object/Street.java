package object;

public class Street
{
    private String name;

    public Street(String streetName)
    {
        this.name = streetName;
    }

    public String toString()
    {
        return "Street{" +
                "name='" + name + '\'' +
                '}';
    }
}

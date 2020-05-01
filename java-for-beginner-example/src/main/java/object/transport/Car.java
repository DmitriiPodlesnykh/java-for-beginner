package object.transport;

public class Car implements EngineVehicle, SaleObject
{
    private boolean isCarEngineEnable = false;


    @Override
    public void start()
    {
        isCarEngineEnable = true;
    }

    @Override
    public void stop()
    {
        isCarEngineEnable = false;
    }

    @Override
    public void setSpeed()
    {

    }

    @Override
    public boolean isOn()
    {
        return isCarEngineEnable;
    }

    @Override
    public int getCurrentPrice()
    {
        return 100;
    }
}

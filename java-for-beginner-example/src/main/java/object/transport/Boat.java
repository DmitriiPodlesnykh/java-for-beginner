package object.transport;

public class Boat implements EngineVehicle, SaleObject
{
    private boolean isEnableSmallEngine = false;

    @Override
    public void start()
    {
        isEnableSmallEngine = true;

    }

    @Override
    public void stop()
    {
        isEnableSmallEngine = false;
    }

    @Override
    public void setSpeed()
    {

    }

    @Override
    public boolean isOn()
    {
        return isEnableSmallEngine;
    }

    @Override
    public int getCurrentPrice()
    {
        return 100000;
    }
}

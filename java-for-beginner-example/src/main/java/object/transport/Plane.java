package object.transport;

import object.MoveObject;

public class Plane implements EngineVehicle, SaleObject, MoveObject
{
    private boolean isEnableLeftPlaneEngine = false;
    private boolean isEnableRightPlaneEngine = false;

    private int price = 100000000;
    private int workHours = 0;

    private int distance = 0;

    public Plane()
    {

    }

    public Plane(int maxCountPeople)
    {

    }

    @Override
    public void start()
    {
        isEnableLeftPlaneEngine = true;
        isEnableRightPlaneEngine = true;
        workHours = workHours +2;
    }

    @Override
    public void stop()
    {
        isEnableLeftPlaneEngine = true;
        isEnableRightPlaneEngine = true;
    }

    @Override
    public void setSpeed()
    {

    }

    @Override
    public boolean isOn()
    {

//        if (isEnableRightPlaneEngine == true && isEnableLeftPlaneEngine)
//        {
//            return true;
//        }
//        else {
//            return false;
//        }
        return isEnableLeftPlaneEngine && isEnableRightPlaneEngine;
    }

    @Override
    public int getCurrentPrice()
    {
        return price - workHours*100;
    }

    @Override
    public void move(int newDistance)
    {
        distance = distance + newDistance;
    }

    @Override
    public int getDistance()
    {
        return distance;
    }
}

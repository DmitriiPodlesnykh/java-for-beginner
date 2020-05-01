package lesson;

import animal.Cat;
import object.MoveObject;
import object.transport.Boat;
import object.transport.Car;
import object.transport.EngineVehicle;
import object.transport.Plane;
import object.transport.SaleObject;

public class InterfaceLesson
{
    public static void startLessonExample()
    {
        // Обращаемся к экземплярам класса напрямую.
        showExampleInstancesWithoutInterface();

        // Обращаемся к экземплярам класса через интерфейс SaleObjects
        showExampleInstancesAsSaleObjects();

        // Обращаемся к экземплярам класса через интерфейс SaleObjects
        showExampleInstancesAsEngineVehicle();

        // Обращаемся к экземплярам класса через интерфейс MoveObject
        showExampleInstancesAsMoveObject();

        //Создаем один экземпляр класса Plane и присваиваем его нескольким переменным разного типа.
        showExampleSameInstanceDiffLinks();
    }

    private static void showExampleInstancesWithoutInterface()
    {
        Car car = new Car();
        Plane plane = new Plane();
        Boat boat = new Boat();
    }

    private static void showExampleInstancesAsSaleObjects()
    {
        SaleObject[] saleObjects = new SaleObject[] { new Car(), new Boat(), new Plane() };

        for (SaleObject saleObject : saleObjects)
        {
            int price = saleObject.getCurrentPrice();
            System.out.println(price);
        }
    }

    private static void showExampleInstancesAsEngineVehicle()
    {
        EngineVehicle[] engineVehicle = new EngineVehicle[] { new Car(), new Boat(), new Plane() };
    }

    private static void showExampleInstancesAsMoveObject()
    {
        MoveObject[] moveObjects = new MoveObject[] { new Cat(), new Cat(), new Plane() };
        for (MoveObject moveObject : moveObjects)
        {
            if (moveObject instanceof Plane)
            {
                Plane currentPlane = (Plane)moveObject;
                currentPlane.stop();
            }
            if (moveObject instanceof Cat)
            {
                Cat cat = (Cat)moveObject;
                cat.toString();
            }
        }
    }

    private static void showExampleSameInstanceDiffLinks()
    {
        Plane plane1 = null;
        plane1 = new Plane(212122); //plane1 ссылается на объект с максимальным числом пассажиров 212122

        //moveObject1 ссылается на объект с максимальным числом пассажиров 212122. Можем работать только с методами интерфейса MoveObject
        MoveObject moveObject1 = plane1;

        //plane2 ссылается на тот же самый объект с максимальным числом пассажиров 212122.
        Plane plane2 = (Plane)moveObject1;

        //o ссылается на тот же самый объект с максимальным числом пассажиров 212122. Можем выполнять только методы класса Object
        Object o = plane2;

        //plane3 ссылается на тот же самый объект с максимальным числом пассажиров 212122.
        Plane plane3 = (Plane)o;
    }
}

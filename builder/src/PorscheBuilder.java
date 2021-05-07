package src;

public class PorscheBuilder implements CarBuilder{
    public void startConstruction(){
        System.out.println("Starting the construction of a new porsche");
        _car = new Car();
    }

    public void mountEngine(){
        System.out.println("Mounting the engine");
    }

    public void mountStructure(){
        System.out.println("Mounting the structure");
    }

    public void weld(){
        System.out.println("Welding");
    }

    public void paint(){
        System.out.println("Paiting");
    }

    public Car build(){
        System.out.println("Delivering the porsche");
        return _car;
    }

    private Car _car;
}

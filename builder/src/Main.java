package src;

public class Main {
    public static void main(String args[]){
        System.out.println("Builder");
        CarBuilder carBuilder = new PorscheBuilder();
        carBuilder.startConstruction();
        carBuilder.mountEngine();
        carBuilder.mountStructure();
        carBuilder.weld();
        carBuilder.paint();
        Car porsche = carBuilder.build();
    }
}

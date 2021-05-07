package src;

public interface CarBuilder{
    void startConstruction();
    void mountEngine();
    void mountStructure();
    void weld();
    void paint();
    Car build();
}

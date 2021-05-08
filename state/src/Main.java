package src;

public class Main {
    public static void main(String args[]){
        System.out.println("State");
        Light light = new Light();
        light.lightOn();
        light.lightOn();
        light.lightOff();
        light.lightOn();
    }
}

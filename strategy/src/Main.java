package src;

public class Main{
    public static void main(String args[]){
        System.out.println("Strategy");
        DisplayStrategy pixelatedDisplayStrategy = new PixelatedDisplay();
        DisplayStrategy negativeDisplayStrategy = new NegativeDisplay();

        Duck pixelatedDuck = new Duck(pixelatedDisplayStrategy);
        pixelatedDuck.display();

        Duck negativeDuck = new Duck(negativeDisplayStrategy);
        negativeDuck.display();
    }
}
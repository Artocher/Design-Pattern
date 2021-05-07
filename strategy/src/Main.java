package src;

public class Main{
    public static void main(String args[]){
        System.out.println("Strategy");
        DisplayStrategy displayStrategy = new PixelatedDisplay();
        Duck duck = new Duck();
        duck.display(displayStrategy);
        displayStrategy = new NegativeDisplay();
        duck.display(displayStrategy);
    }
}
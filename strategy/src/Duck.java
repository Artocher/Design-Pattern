package src;

public class Duck implements Toy{
    public void display(DisplayStrategy displayStrategy){
        displayStrategy.display();
    }
}

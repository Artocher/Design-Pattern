package src;

import src.DisplayStrategy;

public class Duck implements Toy{
    public Duck(DisplayStrategy displayStrategy){
        _displayStrategy = displayStrategy;
    }
    
    public void display(){
        _displayStrategy.display();
    }

    private DisplayStrategy _displayStrategy;
}

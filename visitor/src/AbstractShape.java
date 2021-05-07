package src;

public abstract class AbstractShape implements Shape{
    public AbstractShape(int x, int y){
        moveTo(x,y);
    }

    public void moveTo(int x, int y){
        _x = x;
        _y = y;
    }

    private int _x;
    private int _y;
}

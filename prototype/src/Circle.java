package src;

public class Circle extends AbstractForm{
    public Circle(int x, int y){
        _x = x;
        _y = y;
    }

    public Circle clone(){
        Circle clonedCircle = (Circle) super.clone();
        return clonedCircle;
    }

    public void moveTo(int x, int y){
        _x = x;
        _y = y;
    }

    public int getX(){
        return _x;
    }

    public int getY(){
        return _y;
    }

    private int _x;
    private int _y;
}

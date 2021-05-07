package src;

import java.util.ArrayList;

public class Circle extends AbstractShape{
    public Circle(int x, int y, int radius){
        super(x,y);
        _radius = radius;
    }

    public void acceptVisitor(IShapeVisitor visitor){
        visitor.visit(this);
    }

    public int getRadius(){
        return _radius;
    }

    private int _radius;
}

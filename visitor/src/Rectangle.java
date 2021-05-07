package src;

public class Rectangle extends AbstractShape{
    public Rectangle(int x, int y, int width, int height){
        super(x,y);
        _width = width;
        _height = height;
    }

    public void acceptVisitor(IShapeVisitor visitor){
        visitor.visit(this);
    }

    public int getWidth(){
        return _width;
    }

    public int getHeight(){
        return _height;
    }

    private int _width;
    private int _height;
}

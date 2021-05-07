package src;

public class ShapePerimeterVisitor implements IShapeVisitor{

    public void visit(Circle circle){
        _perimeter = 2*3.14*circle.getRadius();
    }

    public void visit(Rectangle rectangle){
        _perimeter = 2*rectangle.getWidth()+2*rectangle.getHeight();
    }

    public double getPerimeter(){
        return _perimeter;
    }

    private double _perimeter;
}

package src;

public class ShapeDrawVisitor implements IShapeVisitor{
    public void visit(Circle circle){
        System.out.println("Drawing circle");
    }

    public void visit(Rectangle rectangle){
        System.out.println("Drawing rectangle");
    }
}

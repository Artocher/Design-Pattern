package src;

public interface IShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}

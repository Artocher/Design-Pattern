package src;

public interface Shape {
    void moveTo(int x, int y);
    void acceptVisitor(IShapeVisitor visitor);
}

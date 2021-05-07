package src;

public class Main {
    public static void main(String args[]){
        System.out.println("Visitor");
        ShapeDrawVisitor shapeDrawVisitor = new ShapeDrawVisitor();
        ShapePerimeterVisitor shapePerimeterVisitor = new ShapePerimeterVisitor();
        Shape circle = new Circle(0,0,10);
        Shape rectangle = new Rectangle(5,5,30,10);
        circle.acceptVisitor(shapeDrawVisitor);
        rectangle.acceptVisitor(shapePerimeterVisitor);
        System.out.println("The rectangle's perimeter is " + shapePerimeterVisitor.getPerimeter());
    }
}

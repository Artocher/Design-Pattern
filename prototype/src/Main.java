package src;

public class Main {
    public static void main(String args[]){
        System.out.println("Prototype");
        Circle circle = new Circle(5,2);
        Circle clone = circle.clone();
        System.out.println("Circle: " + circle.getX() + ", " + circle.getY());
        System.out.println("Circle: " + clone.getX() + ", " + clone.getY());
        circle.moveTo(0,2);
        System.out.println("Circle: " + circle.getX() + ", " + circle.getY());
        System.out.println("Circle: " + clone.getX() + ", " + clone.getY());
    }
}

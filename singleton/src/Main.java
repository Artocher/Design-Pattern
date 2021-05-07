package src;

public class Main {
    public static void main(String args[]){
        System.out.println("Singleton");
        Singleton singleton = Singleton.getInstance(0);
        Singleton same = Singleton.getInstance(0);
        Singleton other = Singleton.getInstance(1);

        System.out.println(singleton);
        System.out.println(same);
        System.out.println(other);
    }
}

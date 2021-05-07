package src;

public class Main {
    public static void main(String args[]){
        System.out.println("Proxy");
        User user = new User(10);
        Game gta = new GTA();
        user.playGame(gta);
        gta = new GTAAgeLimit(gta);
        user.playGame(gta);
    }
}

package src;

public class Main {
    public static void main(String args[]){
        System.out.println("Observer");
        Player player1 = new Player();
        Unit unit = new Unit();
        IUnitObserver unitDiedObserver = new UnitDiedObserver(player1);
        unit.addObserver(unitDiedObserver);
        System.out.println("Player has " + player1.getGold() + " gold");
        unit.receiveDamage(60);
        System.out.println("Player has " + player1.getGold() + " gold");
        unit.receiveDamage(50);
        System.out.println("Player has " + player1.getGold() + " gold");
    }
}

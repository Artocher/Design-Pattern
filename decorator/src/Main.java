package src;

public class Main {
    public static void main(String args[]){
        System.out.println("Decorator");
        ISoldier marksman = new Marksman();
        ISoldier warrior = new Warrior();
        System.out.println("Marskman: " + marksman.getAttack() + " attack points, " + marksman.getHealth() + " health");
        System.out.println("Warrior: " + warrior.getAttack() + " attack points, " + warrior.getHealth() + " health");

        marksman = new ArmoredSoldier(marksman);
        System.out.println("Armor decoration applied");
        System.out.println("Marskman: " + marksman.getAttack() + " attack points, " + marksman.getHealth() + " health");
        System.out.println("Warrior: " + warrior.getAttack() + " attack points, " + warrior.getHealth() + " health");
    }
}

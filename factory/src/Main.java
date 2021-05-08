package src;

public class Main {
    public static void main(String args[]){
        System.out.println("Factory");
        SoldierFactory infantryFactory = new InfantryFactory();
        Soldier warrior = infantryFactory.getSoldier();
    }
}

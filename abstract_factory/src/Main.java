package src;

public class Main{
    public static void main(String args[]){
        System.out.println("Abstract Factory");
        ISoldierFactory soldierFactory = new SoldierFactory();
        Soldier soldier = soldierFactory.getMarksman();
    }
}
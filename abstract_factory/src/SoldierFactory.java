package src;

public class SoldierFactory implements ISoldierFactory{
    public Soldier getMarksman(){
        return new Marksman();
    }

    public Soldier getFighter(){
        return new Fighter();
    }
}

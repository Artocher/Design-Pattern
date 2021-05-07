package src;

public class Warrior extends AbstractSoldier{
    public int getHealth(){
        return super.getHealth()+100;
    }

    public int getAttack(){
        return super.getAttack()+10;
    }
}

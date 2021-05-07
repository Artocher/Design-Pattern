package src;

public class Marksman extends AbstractSoldier{
    public int getHealth(){
        return super.getHealth()+50;
    }

    public int getAttack(){
        return super.getAttack()+15;
    }
}

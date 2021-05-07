package src;

public abstract class AbstractSoldier implements ISoldier{
    public int getHealth(){
        return 0;
    }

    public int getAttack(){
        return 0;
    }

    public int parry(int attack){
        return getHealth()-attack;
    }

    public boolean isAlive(){
        if(getHealth()>0)
            return true;
        return false;
    }
}

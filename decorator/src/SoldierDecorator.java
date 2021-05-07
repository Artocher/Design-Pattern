package src;

public abstract class SoldierDecorator implements ISoldier{
    public SoldierDecorator(ISoldier soldier){
        _soldier = soldier;
    }

    public int getHealth(){
        return _soldier.getHealth();
    }

    public int getAttack(){
        return _soldier.getAttack();
    }

    public int parry(int damage){
        return _soldier.parry(damage);
    }

    public boolean isAlive(){
        return _soldier.isAlive();
    }

    private ISoldier _soldier;
}

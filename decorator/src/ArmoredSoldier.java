package src;

public class ArmoredSoldier extends SoldierDecorator{
    public ArmoredSoldier(ISoldier soldier){
        super(soldier);
    }

    public int getHealth(){
        return super.getHealth()+50;
    }
}

package src;

public class Soldier implements IArmyGroup{
    public Soldier(int strength){
        _strength = strength;
    }

    public int countSubordinates(){
        return 1;
    }

    public int strength(){
        return _strength;
    }

    public int wage(){
        return 200;
    }

    private int _strength;
}

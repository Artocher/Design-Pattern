package src;

import java.util.ArrayList;

public class Player{
    public Player(){
        _gold = 0;
    }

    public void addGold(int gold){
        _gold += gold;
    }

    public int getGold(){
        return _gold;
    }

    private int _gold;
    private ArrayList<Unit> _units = new ArrayList<Unit>();
}

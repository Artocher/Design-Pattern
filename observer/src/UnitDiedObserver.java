package src;

public class UnitDiedObserver implements IUnitObserver{
    public UnitDiedObserver(Player player){
        _player = player;
    }

    public void update(Unit unit){
        if(!unit.isAlive()){
            _player.addGold(10);
            unit.removeObserver(this);
        }
    }

    private Player _player;
}

package src;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class ArmyGroupComposite implements IArmyGroup{
    public void addChild(IArmyGroup armyGroup){
        _children.add(armyGroup);
    }

    public void removeChild(IArmyGroup armyGroup){
        if(_children.contains(armyGroup))
            _children.remove(armyGroup);
    }

    public Iterator<IArmyGroup> getChildren(){
        return _children.iterator();
    }

    private ArrayList<IArmyGroup> _children = new ArrayList<IArmyGroup>();
}

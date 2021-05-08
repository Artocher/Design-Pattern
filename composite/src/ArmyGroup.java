package src;

import java.util.Iterator;

public class ArmyGroup extends ArmyGroupComposite{
    public int countSubordinates(){
        int count = 0;
        Iterator<IArmyGroup> children = getChildren();
        while(children.hasNext())
            count += children.next().countSubordinates();
        return count;
    }

    public int strength(){
        int strength = 0;
        Iterator<IArmyGroup> children = getChildren();
        while(children.hasNext())
            strength += children.next().strength();
        return strength;
    }

    public int wage(){
        int wage = 0;
        Iterator<IArmyGroup> children = getChildren();
        while(children.hasNext())
            wage += children.next().wage();
        return wage;
    }
}

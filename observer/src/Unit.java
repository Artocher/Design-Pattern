package src;

import java.util.ArrayList;

public class Unit implements IUnitObservable{
    public Unit(){
        _health = 100;
    }

    public void receiveDamage(int damage){
        _health -= damage;
        notifyObservers();
    }

    public boolean isAlive(){
        if(_health>0)
            return true;
        return false;
    }

    public void addObserver(IUnitObserver observer){
        if(!_observers.contains(observer))
            _observers.add(observer);
    }

    public void removeObserver(IUnitObserver observer){
        if(_observers.contains(observer))
            _observers.remove(observer);
    }

    public void notifyObservers(){
        Object[] copy = _observers.toArray();
		for (Object u : copy)
			((IUnitObserver) u).update(this);
    }

    private int _health;
    private ArrayList<IUnitObserver> _observers = new ArrayList<IUnitObserver>();
}

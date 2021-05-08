package src;

public interface IUnitObservable {
    void addObserver(IUnitObserver observer);
    void removeObserver(IUnitObserver observer);
    void notifyObservers();
}

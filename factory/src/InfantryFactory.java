package src;

public class InfantryFactory implements SoldierFactory{
    public Soldier getSoldier(){
        return new Fighter();
    }

    //Apparemment on peut mettre d'autre méthodes en lien avec ça mais ??? 
}

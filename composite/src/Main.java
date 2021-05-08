package src;

public class Main {
    public static void main(String args[]){
        System.out.println("Composite");
        ArmyGroupComposite frenchArmy = new ArmyGroup();
        ArmyGroupComposite parisCasern = new ArmyGroup();
        ArmyGroupComposite bordeauxCasern = new ArmyGroup();
        ArmyGroupComposite lyonCasern = new ArmyGroup();

        IArmyGroup nicolas = new Soldier(5);
        IArmyGroup jean = new Soldier(8);
        IArmyGroup charles = new Soldier(3);
        IArmyGroup thimothé = new Soldier(2);
        IArmyGroup ludovic = new Soldier(10);
        IArmyGroup eliott = new Soldier(15);
        IArmyGroup matthieu = new Soldier(1);
        IArmyGroup wylan = new Soldier(10);
        IArmyGroup vincent = new Soldier(7);

        lyonCasern.addChild(nicolas);
        lyonCasern.addChild(jean);

        bordeauxCasern.addChild(charles);
        bordeauxCasern.addChild(thimothé);
        bordeauxCasern.addChild(ludovic);
        bordeauxCasern.addChild(eliott);

        parisCasern.addChild(matthieu);
        parisCasern.addChild(wylan);
        parisCasern.addChild(vincent);

        frenchArmy.addChild(lyonCasern);
        frenchArmy.addChild(parisCasern);
        frenchArmy.addChild(bordeauxCasern);

        System.out.println("Soldier nicolas : count(" + nicolas.countSubordinates() + "), strength(" + nicolas.strength() + "), wage(" + nicolas.wage() + ")");
        System.out.println("Bordeaux's casern : count(" + bordeauxCasern.countSubordinates() + "), strength(" + bordeauxCasern.strength() + "), wage(" + bordeauxCasern.wage() + ")");
        System.out.println("Lyon's casern : count(" + lyonCasern.countSubordinates() + "), strength(" + lyonCasern.strength() + "), wage(" + lyonCasern.wage() + ")");
        System.out.println("Paris' casern : count(" + parisCasern.countSubordinates() + "), strength(" + parisCasern.strength() + "), wage(" + parisCasern.wage() + ")");

        System.out.println("French army : strength(" + frenchArmy.countSubordinates() + "), strength(" + frenchArmy.strength() + "), wage(" + frenchArmy.wage() + ")");
        


    }
}

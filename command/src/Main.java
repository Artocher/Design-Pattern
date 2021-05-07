package src;

public class Main{
    public static void main(String args[]){
        System.out.println("Command");
        IEntity monster = new Monster();
        IEntity human = new Human();
        IEntityCommand moveCommand = new MoveEntityCommand(human);
        IEntityCommand attackCommand = new EntityAttackCommand(monster);

        EntityInvoker entityInvoker = new EntityInvoker(moveCommand);
        entityInvoker.execute();
        entityInvoker = new EntityInvoker(attackCommand);
        entityInvoker.execute();
    }
}
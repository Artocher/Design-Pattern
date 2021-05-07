package src;

public class EntityAttackCommand implements IEntityCommand{
    public EntityAttackCommand(IEntity entity){
        _entity = entity;
    }

    public void execute(){
        _entity.attack();
    }

    private IEntity _entity;
}

package src;

public class MoveEntityCommand implements IEntityCommand{
    public MoveEntityCommand(IEntity entity){
        _entity = entity;
    }

    public void execute(){
        _entity.move();
    }

    private IEntity _entity;
}

package src;

public class EntityInvoker {
    public EntityInvoker(IEntityCommand command){
        _command = command;
    }

    public void execute(){
        _command.execute();
    }

    private IEntityCommand _command;
}

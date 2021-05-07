package src;

public abstract class AbstractForm implements Form{
    public AbstractForm clone(){
        AbstractForm result = null;
        try{
            result = (AbstractForm) super.clone();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}

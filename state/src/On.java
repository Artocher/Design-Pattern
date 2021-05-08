package src;

public class On extends AbstractLightState{
    public On(Light light){
        super(light);
    }

    public void lightOn(){
        System.out.println("Light can't be turned on cause it already is");
    }

    public void lightOff(){
        System.out.println("Turning light off");
        getLight().changeState(new Off(getLight()));
    }
}

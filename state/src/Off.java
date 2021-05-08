package src;

public class Off extends AbstractLightState{
    public Off(Light light){
        super(light);
    }

    public void lightOff(){
        System.out.println("Light can't be turned off cause it already is");
    }

    public void lightOn(){
        System.out.println("Turning light on");
        getLight().changeState(new On(getLight()));
    }
}

package src;

public abstract class AbstractLightState implements ILightState {
    public AbstractLightState(Light light){
        _light = light;
    }

    public Light getLight(){
        return _light;
    }

    private Light _light;
}

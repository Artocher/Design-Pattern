package src;

public class Light {
    public Light(){
        _state = new Off(this);
    }

    public void lightOn(){
        _state.lightOn();
    }

    public void lightOff(){
        _state.lightOff();
    }

    public void changeState(ILightState state){
        _state = state;
    }

    private ILightState _state;
}

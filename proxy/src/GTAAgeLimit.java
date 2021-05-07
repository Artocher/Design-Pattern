package src;

public class GTAAgeLimit implements Game{
    GTAAgeLimit(Game game){
        _game = game;
        _ageLimit = 18;
    }

    public void play(int age){
        if(age < _ageLimit)
            System.out.println("User is too young to play the game");
        else
            _game.play(age);   
    }

    private int _ageLimit;
    private Game _game;
}

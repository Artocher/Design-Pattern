package src;

public class User {
    public User(int age){
        _age = age;
    }
    
    public void playGame(Game game){
        game.play(_age);
    }

    private int _age;
}

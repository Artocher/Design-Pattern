package src;

public interface ISoldier {
    int getHealth();
    int parry(int damage);
    int getAttack();
    boolean isAlive();
}

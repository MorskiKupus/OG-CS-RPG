package src;

public class Knight extends Stats{
    int hpPot = 1;
    String sword;
    String shield;

    public int getHpPot() {
        return hpPot;
    }

    public String getSword() {
        return sword;
    }

    public String getShield() {
        return shield;
    }

    public Knight(int atk, int mAtk, int def, int hp, int mana) {
        super(atk, mAtk, def, hp, mana);
    }
}

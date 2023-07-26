package src;

public class Stats {
    int atk = 5;
    int mAtk = 5;
    int def = 5;

    public int getAtk() {
        return atk;
    }

    public int getmAtk() {
        return mAtk;
    }

    public int getDef() {
        return def;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public Stats(int atk, int mAtk, int def, int hp, int mana) {
        this.atk = atk;
        this.mAtk = mAtk;
        this.def = def;
        this.hp = hp;
        this.mana = mana;
    }

    int hp = 20;
    int mana = 10;
}

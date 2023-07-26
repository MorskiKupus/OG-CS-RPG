package src;

public class Enemy {
    private String name;
    private int hp;
    private int atk;

    private int xp;

    public Enemy(String name, int hp, int atk, int xp;)

    {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }


    public int getAtk() {
        return atk;
    }

    public int getXp() {
        return xp;
    }
}
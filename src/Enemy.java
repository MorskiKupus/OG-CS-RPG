package src;

public class Enemy {
    private String name;
    private int hp;
    private int atk;


    public Enemy(String name, int hp, int atk)

    {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
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

}

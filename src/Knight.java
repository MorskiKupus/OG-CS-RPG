package src;

public class Knight extends Stats{
  private   int hpPot;
   private  int attack;
   private int defence;

    public Knight(int hpPot, int attack, int defence) {
        this.hpPot = hpPot;
        this.attack = attack;
        this.defence = defence;
    }

    public int getHpPot() {
        return hpPot;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }
}

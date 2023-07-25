package src;
public class Enemy {
  int atk;

  public int getAtk() {
    return atk;
  }

  public void setAtk(int atk) {
    this.atk = atk;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public String getName() {
    return name;
  }

  public Enemy(int atk, int hp, String name) {
    this.atk = atk;
    this.hp = hp;
    this.name = name;
  }

  int hp;
  String name;
}

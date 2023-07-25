package src;

public class Character {
    String Knight;
    String Mage;
    String Rogue;


    public Character(String knight, String mage, String rogue) {
        Knight = knight;
        Mage = mage;
        Rogue = rogue;
    }

    public String getKnight() {
        return Knight;
    }

    public String getMage() {
        return Mage;
    }

    public String getRogue() {
        return Rogue;
    }
}

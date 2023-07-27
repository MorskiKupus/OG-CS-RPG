package src;

import java.io.Serializable;

public class Items implements Serializable {
    private String name;
    private int price;

    public Items(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

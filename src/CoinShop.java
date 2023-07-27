package src;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinShop extends Inventory{
   private ArrayList<String> shop;
   private int price = 30;
   int wallet = 0;
   int healthPotionPrice = 50;

   Inventory inventory = new Inventory();
   public CoinShop() {
      shop = new ArrayList<>();
   }


   public void addItem(String item) {
      shop.add(item);
   }

   public void displayShop() {
      if (shop.isEmpty()) {
         System.out.println("shop is empty.");
      } else {
         System.out.println("shop contains:");
         for (String item : shop) {
            System.out.println("- " + item);
         }
      }
   }

   public CoinShop(ArrayList<String> shop, int price) {
      this.shop = shop;
      this.price = price;
   }

   public ArrayList<String> getShop() {
      return shop;
   }

   public int getPrice() {
      return price;
   }

   public void buyHealthPotion(){
      System.out.println("Press 1 to buy an health potion");
      System.out.println("Health potions cost: 50 coins you have: " + wallet +" coins in your wallet");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      if(input.equalsIgnoreCase("1")){
         wallet = wallet - healthPotionPrice;
         inventory.addItem("Health Potion");
         inventory.displayInventory();
      }
      System.out.println("you have " + wallet + " coins in your wallet");
   }
}





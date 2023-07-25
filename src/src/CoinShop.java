import java.util.ArrayList;

public class CoinShop{
   private ArrayList<String> shop;
   private int price = 30;
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
}



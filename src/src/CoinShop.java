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
   /*
        CoinShop coinShop = new CoinShop();
        int wallet = 50;
        int enemy = 5;
        int swordDamage = 10;
        coinShop.addItem("healthPotions");

        Inventory playerInventory = new Inventory();
        playerInventory.addItem("Sword");
        playerInventory.addItem("shield");


        Scanner something = new Scanner(System.in);
        if(enemy < swordDamage){
            System.out.println("you have defeated an enemy");
            wallet = wallet + 2;
        }
        else{
            System.out.println("enemy has slain you");
        }

        System.out.println("press P to open your inventory or move forward");

        while(true){
            String input = something.nextLine();
            if(input.equalsIgnoreCase("p")){
                System.out.println("You have " + wallet + "coins");
                coinShop.displayShop();
                System.out.println("press b to buy it");
                }else if (input.equalsIgnoreCase("b")) {
                    playerInventory.addItem("health potion");
                System.out.println("open your inventory ");
            } else if (input.equalsIgnoreCase("e")) {
                    playerInventory.displayInventory();
                }
            else if (input.equalsIgnoreCase("w")) {
                playerInventory.moveForward();
            }
            } */
}



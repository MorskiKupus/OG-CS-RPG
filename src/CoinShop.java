package src;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinShop implements Serializable {
   private List<Items> shop;
   private int wallet = 300;
   private int healthPotionPrice = 50;
   private int swordUpgradePrice = 100;
   private boolean swordUpgradeBought = false;
   private int numHealthPotions = 2;
   private int numSwordUpgrade = 1;
   private String healthPotionDescription = " (+20 hp when used)";
   private String swordDescription = " (+5 attack damage)";
   Knight knight = new Knight(2,5,2);



   Inventory inventory = new Inventory();


            //ADD ITEMS HERE
   public CoinShop() {
      shop = new ArrayList<>();
      // Add some initial items to the shop
      shop.add(new Items("Health Potion", healthPotionPrice));
      shop.add(new Items("Sword Upgrade", swordUpgradePrice));
   }

            //OPEN SHOP
   public void openShop() {
      System.out.println("\u001B[33mWelcome to the shop!" + "\u001B[00m");
      System.out.println("You have " + wallet + " coins in your wallet.");

      checkAndAddItemsToShop();
      displayAvailableItems();

      Scanner scanner = new Scanner(System.in);

      boolean hasMoreItems = true;
      while (hasMoreItems && wallet > 0) {
         int numOfItems = Math.min(2, shop.size());

         if (numOfItems > 0) {
            System.out.println("Enter the number of the item you want to buy (or 0 to exit):");

            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= numOfItems) {
               Items selectedItem = shop.get(choice - 1);
               buyItem(selectedItem);
               removeSoldOutItems();
            } else if (choice == 0) {
               hasMoreItems = false;
            } else {
               System.out.println("Invalid choice. Please try again.");
            }
         } else {
            System.out.println("Sorry, the shop is empty.");
            hasMoreItems = false;
         }
      }

      if (wallet > 0) {
         System.out.println("You have " + wallet + " coins remaining in your wallet.");
         System.out.println("Do you want to continue shopping? (1 for Yes / 0 for No)");
         int continueShoppingChoice = scanner.nextInt();
         if (continueShoppingChoice == 1) {
            openShop();
         }
      }

      System.out.println("Thank you for visiting the shop!");
   }

   private void checkAndAddItemsToShop() {
      boolean hasHealthPotion = false;
      boolean hasSwordUpgrade = false;
      for (Items item : shop) {
         if (item.getName().equals("Health Potion")) {
            hasHealthPotion = true;
         } else if (item.getName().equals("Sword Upgrade")) {
            hasSwordUpgrade = true;
         }
      }

      if (!hasHealthPotion) {
         shop.add(new Items("Health Potion", healthPotionPrice));
      }
      if (!hasSwordUpgrade) {
         shop.add(new Items("Sword Upgrade", swordUpgradePrice));
      }
   }

   private void displayAvailableItems() {
      if (!shop.isEmpty()) {
         System.out.println("Available Items:");
         for (int i = 0; i < shop.size(); i++) {
            Items item = shop.get(i);
            String itemName = item.getName();
            String itemDescription = " - Price: " + item.getPrice() + " coins";
            if (itemName.equals("Health Potion")) {
               itemDescription += " x" + numHealthPotions + healthPotionDescription;
            }
            if(itemName.equals("Sword Upgrade")){
               itemDescription += " x" + numSwordUpgrade + swordDescription;

            }
            System.out.println((i + 1) + ". " + itemName + itemDescription );
         }
      } else {
         System.out.println("The shop is currently empty.");
      }
   }

   private void removeSoldOutItems() {
      shop.removeIf(item -> (item.getName().equals("Health Potion") && numHealthPotions <= 0) ||
              (item.getName().equals("Sword Upgrade") && swordUpgradeBought));
   }

   public void buyItem(Items item) {
      if (wallet >= item.getPrice()) {
         wallet -= item.getPrice();
         System.out.println("You bought a " + item.getName() + "!");
         if (item.getName().equals("Health Potion")) {
            numHealthPotions--;
            inventory.addItem("Health potion ");
            System.out.println("Health potions remaining: " + numHealthPotions);
         } else if (item.getName().equals("Sword Upgrade")) {
            swordUpgradeBought = true;
            inventory.addItem("Better sword ");
            int attackUpgrade = knight.getAttack() + 5;
            System.out.println("You can no longer buy the Sword Upgrade.");
            System.out.println(attackUpgrade);
         }
         System.out.println("You have " + wallet + " coins left.");
      } else {
         System.out.println("You don't have enough coins to buy the " + item.getName() + ".");
      }
      inventory.displayInventory();
   }



}

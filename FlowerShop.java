import java.util.Scanner;

public class FlowerShop {
  public static final int SIZE = 10;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Create an array to store Flower objects
    Flower[] inventory = new Flower[SIZE];

    for (int i = 0; i < SIZE; i++) {
      System.out.println("Enter the details for flower " + (i + 1) + ":");
      System.out.print("Name: ");
      String name = input.nextLine();
      System.out.print("Color: ");
      String color = input.nextLine();
      System.out.print("Price: RM");
      double price = input.nextDouble();
      System.out.print("Quantity: ");
      int quantity = input.nextInt();
      input.nextLine(); // Consume the newline character

      // Create a Flower object with the user input
      Flower f = new Flower(name, color, price, quantity);

      // Store the object in the array
      inventory[i] = f;
    }

    System.out.println("\nFlower Inventory:");
    for (int i = 0; i < SIZE; i++) {
      System.out.println("Flower " + (i + 1) + ":");
      System.out.println(inventory[i]);
    }

    double totalValue = 0.0;
    for (int i = 0; i < SIZE; i++) {
      totalValue += inventory[i].getPrice() * inventory[i].getQuantity();
    }
    System.out.println("The total value of the flower inventory is RM" + totalValue);

    System.out.print("\nEnter the name of the flower you want to search: ");
    String searchName = input.nextLine();
    boolean found = false;
    for (int i = 0; i < SIZE; i++) {
      if (inventory[i].getName().equalsIgnoreCase(searchName)) {
        System.out.println("The flower you are looking for is:");
        System.out.println(inventory[i]);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Sorry, the flower you are looking for is not in the inventory.");
    }

    System.out.print("\nEnter the name of the flower you want to restock: ");
    String restockName = input.nextLine();
    System.out.print("Enter the new quantity: ");
    int newQuantity = input.nextInt();
    boolean updated = false;
    for (int i = 0; i < SIZE; i++) {
      if (inventory[i].getName().equalsIgnoreCase(restockName)) {
        inventory[i].setQuantity(newQuantity);
        System.out.println("The flower inventory has been updated.");
        updated = true;
        break;
      }
    }

    if (!updated) {
      System.out.println("Sorry, the flower you want to restock is not in the inventory.");
    }

    input.close();
  }
}

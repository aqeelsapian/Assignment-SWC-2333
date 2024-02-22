// Define the Flower class
public class Flower {
  // Declare the attributes
  private String name;
  private String color;
  private double price;
  private int quantity;

  // Define the constructors
  public Flower() {
    // Default constructor
    name = "";
    color = "";
    price = 0.0;
    quantity = 0;
  }

  public Flower(String name, String color, double price, int quantity) {
    // Parameterized constructor
    this.name = name;
    this.color = color;
    this.price = price;
    this.quantity = quantity;
  }

  // Define the accessor methods
  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  // Define the mutator methods
  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  // Define the toString() method
  public String toString() {
    return "Name: " + name + "\nColor: " + color + "\nPrice: RM" + price + "\nQuantity: " + quantity + "\n";
  }
}


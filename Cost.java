import java.util.Scanner;
public class Cost {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the quantity: ");
    int quantity = sc.nextInt();
    int cost = quantity * 100;
    double discount = 0;
    if (cost > 1000) {
      discount = cost * 0.1;
    }
    double totalCost = cost - discount;
    System.out.println("The total cost is: " + totalCost);
  }
}



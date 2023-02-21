import java.util.Scanner;
public class rectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    int length = sc.nextInt();
    System.out.print("Enter the breadth of the rectangle: ");
    int breadth = sc.nextInt();
    if (length == breadth) {
      System.out.println("The rectangle is a square.");
    } else {
      System.out.println("The rectangle is not a square.");
    }
  }
}

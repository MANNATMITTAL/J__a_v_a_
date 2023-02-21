import java.util.Scanner;
public class Bonus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your salary: ");
    double salary = sc.nextDouble();
    System.out.print("Enter your years of service: ");
    int yearsOfService = sc.nextInt();
    double bonus = 0;
    if (yearsOfService > 5) {
      bonus = salary * 0.05;
    }
    System.out.println("The net bonus amount is: " + bonus);
  }
}

 

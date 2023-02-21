import java.util.Scanner;
public class Greater_no{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int first = sc.nextInt();
    System.out.print("Enter the second integer: ");
    int second = sc.nextInt();
    if (first > second) {
      System.out.println("The greatest number is: " + first);
    } 
    else if( first == second) {
      System.out.println("both are equal");
    }
    else{ System.out.println("the greatest number is :" + second);}
  }
}

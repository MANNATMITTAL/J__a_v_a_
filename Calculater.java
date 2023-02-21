import java.util.Scanner;

class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2:");
        double num2 = sc.nextDouble();
        System.out.println("Enter your operator:");
        char operator = sc.next().charAt(0);
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
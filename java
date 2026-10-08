import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
       double num1, num2, result;
       char operator;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number:");
       num1 = sc.nextDouble();
       System.out.println("Enter second number:");
       num2 = sc.nextDouble();
       System.out.println("Enter operator (+, -, *, /):");
       operator = sc.next().charAt(0);
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
               if (num2 == 0) {
                   System.out.println("Division by zero is not allowed.");
                   return;
               }
               result = num1 / num2;
               break;
           default:
               System.out.println("Invalid operator!");
               return;
       }
       System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
   }
}

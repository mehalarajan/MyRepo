import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();
        System.out.print("Enter an symbol (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);
        double result;

        switch(symbol)
        {
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
                System.out.println("You entered wrong symbol");
                return;
        }

        System.out.println(num1+" "+symbol+" "+num2+": "+result);
    }
}


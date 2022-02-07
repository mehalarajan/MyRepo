import java.util.Scanner;
public class OddEven {
   /* public static void main(String[] args)
    {

        // Declare and initializing integer variable
        int n = 91;

        // Condition Check
        // Bitwise AND of any odd number by 1 gives 1
        if ((n & 1) == 1) {

            // Print statement
            System.out.println("Number is Odd");
        }
        else {

            // Print statement
            System.out.println("Number is Even");
        }*/
        public static void main(String[] args)
        {
            int num;
            System.out.println("Enter an Integer number:");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            if ( num % 2 == 0 )
                System.out.println("Entered number is even");
            else
                System.out.println("Entered number is odd");
        }
    }


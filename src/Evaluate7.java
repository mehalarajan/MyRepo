import java.util.Scanner;
public class Evaluate7 {

        public static void main(String[] args) {

            int number;

            // create an object of Scanner class
            Scanner sc = new Scanner(System.in);

            // ask users to enter numbers
            System.out.println("Enter a number: ");
            number = sc.nextInt();

            boolean flag = false;
            for (int i = 2; i <= number / 2; ++i) {

                // condition for i to be a prime number
                if (checkPrime(i)) {

                    // condition for n-i to be a prime number
                    if (checkPrime(number - i)) {

                        // n = primeNumber1 + primeNumber2
                        System.out.printf("%d = %d + %d\n", number, i, number - i);
                        flag = true;
                    }

                }
            }

            if (!flag) {
                System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
            }else {
                System.out.println(number + " is expressed as the sum of two prime numbers.");
            }
            sc.close();
        }

        // Function to check prime number
        public static boolean checkPrime(int num) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            return isPrime;
        }
    }


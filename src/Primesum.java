import java.util.Scanner;
public class Primesum {
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
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (checkPrime(i)) {
                if (checkPrime(num-i)) {

                    System.out.printf("%d = %d + %d\n", num, i, num - i);
                    flag = true;
                }

            }
        }

        if (!flag) {
            System.out.println(num + " cannot be expressed as the sum of two prime num.");
        }else {
            System.out.println(num + " is expressed as the sum of two prime num.");
        }
    }
    
}

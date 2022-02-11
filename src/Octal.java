import java.util.Scanner;
public class Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter octal value");
        int octal = sc.nextInt();
        int decimal = 0;
        int count = 0;
        int mod = 0;
        while (octal > 0) {
            mod = octal % 10;
            decimal = decimal + (mod * (int) Math.pow(8, count++));
            octal = octal / 10;
        }
        System.out.println(decimal);

    }
}

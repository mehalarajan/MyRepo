import java.util.Scanner;
public class Digitcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        int count = 0, num = 198;
        while (num != 0) {
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);

    }
}

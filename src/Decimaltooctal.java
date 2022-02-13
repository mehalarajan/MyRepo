import java.util.Scanner;
public class Decimaltooctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal value=");
        int num = sc.nextInt();
        int binary=decimaltobinary(num);
        System.out.println("the binary value is:" + binary);
        int octal=decimaltooctal(num);
        System.out.println("the octal value is:" + octal);
    }
    public static int decimaltobinary(int num){
        int i = 1, sum = 0, rem, temp;
        temp = num;
        while (temp != 0) {
            rem = temp % 2;
            System.out.println("rem="+ rem);
            sum = sum + i * rem;
            System.out.println("sum="+ sum);
            i = i * 10;
            System.out.println("i="+ i);
            temp = temp / 2;
            System.out.println("temp="+ temp);
        }
        return sum;
    }
    public static int decimaltooctal(int num){
        int i = 1, sum = 0, rem, temp;
        temp = num;
        while (temp != 0) {
            rem = temp % 8;
            System.out.println("rem="+ rem);
            sum = sum + i * rem;
            System.out.println("sum="+ sum);
            i = i * 10;
            System.out.println("i="+ i);
            temp = temp / 8;
            System.out.println("temp="+ temp);
        }
        return sum;
    }

    }


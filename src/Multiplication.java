import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("*******enter number for the multiplication table******");
        int num=sc.nextInt();
        int  i = 1;
        while(i<=20){
            System.out.printf("%d * %d = %d \n", i, num, i * num);
            i++;

        }
    }
}

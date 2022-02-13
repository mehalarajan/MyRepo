import java.util.Scanner;
public class Evaluate22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a=");
        int a=sc.nextInt();
        a+=a++ + ++a + --a + a--;
        System.out.println(a);
    }
}

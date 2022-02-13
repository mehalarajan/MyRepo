import java.util.Scanner;
public class Evaluate5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a=");
        int a=sc.nextInt();
        System.out.println("enter b=");
        int b=sc.nextInt();
        System.out.println("++a-b-- = "+(++a-b--));
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a%b++ = "+(a%b++));
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println();
        System.out.println("a*=b+5 = "+(a*=b+5));
        System.out.println("a="+a);
        System.out.println("b="+b);
        int x=69>>2;
        System.out.println("x = "+x);
    }
}

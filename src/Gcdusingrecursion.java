import java.util.Scanner;
public class Gcdusingrecursion {
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
    static int gcd(int a, int b){
        if(a%b==0)
            return b;
        return gcd(b,a%b);
    }

}

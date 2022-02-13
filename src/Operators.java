import java.util.Scanner;
public class Operators {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a=");
        int a=sc.nextInt();
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a++);
        int c= ++a - ++a;
        System.out.println(c);
        System.out.println(a--);


    }
}

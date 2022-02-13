import java.util.Scanner;
public class Evaluate3 {
    public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter x");
   int x=sc.nextInt();
    x=x++ * 2+3* --x;
    System.out.println("x++"+x++);
    System.out.println("--x="+--x);
    System.out.println("x="+x);
}
}

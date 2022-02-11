import java.util.Scanner;
public class Binaryoctal {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the binary value");
       String binary=sc.next();
       int decimal=Integer.parseInt(binary,2);
       //System.out.println(decimal);
       String octal= Integer.toOctalString(decimal);
       System.out.println(octal);
    }
}

import java.util.Scanner;
public class Evaluate24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int y=sc.nextInt();
        int z = (++y * (y++ + 5));
        System.out.println(z);
    }
}

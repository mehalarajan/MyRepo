import java.util.Scanner;
public class Kilometers {
    public static void main(String[] args){
        double kilometers;
        System.out.println("enter the number");
        Scanner meter=new Scanner(System.in);
        kilometers=meter.nextDouble();
        double miles=kilometers/1.6;
        System.out.println(miles);
    }
}

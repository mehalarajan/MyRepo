import java.util.Scanner;
public class Acre {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the squarefeet:");
        double squarefeet=sc.nextDouble();
        double acre = squarefeet/43560;

        System.out.format("the calculated acre is: %.4f",acre);
    }
}

import java.util.Scanner;
public class Rough {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year:");
        int year=sc.nextInt();
       if(leapyear(year))
        {
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }

    }
    public static boolean leapyear(int year){
        if((year%4==0&&year%100==0)||(year%400==0))
        {
            return true;
        }
        else{
            return false;
        }

    }
}

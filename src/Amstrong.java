import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        if(amstrongnumber (number)){
            System.out.println("it is an amstrong number");
        }
        else {
            System.out.println("it is not a amstrong number");
        }
    }
    public static boolean amstrongnumber(int number){
        int originalNum, remainder, result = 0;
        originalNum = number;
        while (originalNum != 0)
        {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }
        if(result == number)
            return true;
        else
            return false;
    }

    }


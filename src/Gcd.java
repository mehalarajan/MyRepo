import java.util.Scanner;
public class Gcd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x number:" );
        int numx=sc.nextInt();
        System.out.println("enter y number: ");
        int numy=sc.nextInt();
        int  gcd=1;
        for(int i = 1; i <= numx && i <= numy; i++)
        {
            if(numx%i==0 && numy%i==0)
                gcd = i;
        }
        System.out.printf("GCD of %d and %d is: %d", numx, numy, gcd);
    }
}
/* output:
enter x number:
12
enter y number:
24
GCD of 12 and 24 is: 12*/
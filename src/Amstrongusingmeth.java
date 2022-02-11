import java.util.Scanner;
public class Amstrongusingmeth {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int number=sc.nextInt();
    if(isprime(number)){
        System.out.println("it is a prime number");
    }
    else{
        System.out.println("it is not a prime");
    }
    if(isamstrong(number)){
        System.out.println("is a amstrong number");
    }
    else{
        System.out.println("it is not a amstrong number");
    }
}
public static boolean isprime(int number) {
    if (number == 0 || number == 1) {
        return false;
    }
    for (int i = 2; i <= number / 2; i++) {
        if (number % i == 0) {
            return false;
        }

    }
    return true;
}
public static boolean isamstrong(int number){
    int originalnumber=number;
    int sum=0;
    while(number!=0){
       int remainder=number%10;
        sum+=Math.pow(remainder,3);
        number=number/10;

    }
    if(originalnumber==sum) {
        return true;
    }
        else{
            return false;
    }


}
}

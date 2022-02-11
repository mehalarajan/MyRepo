import java.util.Scanner;
public class Intervalamstrong {
    public static void main(String args[]){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ::");
        num1 = sc.nextInt();
        System.out.println("Enter the second number ::");
        num2 = sc.nextInt();
        for (int i = num1; i<num2; i++){
            int originalnumber, rem, sum = 0;
            originalnumber = i;
            while(originalnumber != 0) {
                rem = originalnumber % 10;
                sum += Math.pow(rem, 3);
                //sum = sum + (rem * rem * rem);
                originalnumber = originalnumber / 10;
            }
            if(sum == i){
                System.out.println(""+i+" is an Armstrong number.");
            }
            
        }
    }

}

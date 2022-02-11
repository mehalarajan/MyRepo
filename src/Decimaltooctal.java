import java.util.Scanner;
public class Decimaltooctal {
    public static void main(String[] args){
        int num,i=1,sum=0,rem,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal value=");
        num=sc. nextInt();
        temp=num;
        while(temp!=0){
            rem=temp%8;
            sum=sum+i*rem;
            i=i*10;
            temp=temp/8;
        }
        System.out.println("octal value="+sum);


    }
}

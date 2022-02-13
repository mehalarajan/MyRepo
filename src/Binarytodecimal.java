import java.util.Scanner;
public class Binarytodecimal {
        public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary=sc.nextInt();
        int result=binarytodecimal(binary);
        System.out.println("decimal number "+ result);
            int decitobi=decimaltobinary(result);
            System.out.println("decimal to binary value is" + decitobi );
            int bitooct=binarytooctal(binary);
            System.out.println("binary to octal is "+ bitooct );
            int octtodeci=octaltodecimal(bitooct);
            System.out.println("octal to decimal value is" + octtodeci);
        }
    public static int binarytodecimal(int binary){
            int remainder,sum=0,i=0;
            while(binary!=0){
                remainder=binary%10;
                sum+=remainder*Math.pow(2,i);
                i++;
                binary/=10;
            }
            return sum;
    }
    public static int decimaltobinary(int value ){
            int remainder,sum=0,i=1;
            while(value!=0){
                remainder=value%2;
                sum+=remainder*i;
                i=i*10;
                value/=2;
            }
            return sum;

    }
    public static int binarytooctal(int value2){
            int remainder,sum=0,i=0;
            while(value2!=0){
                remainder=value2%10;
                sum+=remainder*Math.pow(8,i);
                i++;
                value2/=10;
            }
            return sum;

    }
    public static int octaltodecimal(int value3){
            int remainder,sum=0,i=0;
            while(value3!=0){
                remainder=value3%10;
                sum+=remainder*Math.pow(8,i);
                i++;
                value3/=10;
            }
            return sum;
        }
    }


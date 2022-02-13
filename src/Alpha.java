import java.util.Scanner;
public class Alpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char c=sc.next().charAt(0);
        if(alphabet(c)){
            System.out.println("it is an alphabet");
        }

       else if(alphanum(c)){
            System.out.println("it is a number");
        }
        else{
            System.out.println("it is symbol");
        }

    }
    public static boolean alphabet(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean alphanum(char c){

       if(c>='0'&& c<='9') {
            return true;
        }
        else
        {
            return false;
        }
    }
}

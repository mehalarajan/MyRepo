import java.util.Scanner;
public class ASCII {
    public static void main(String[] args)
    {
        System.out.print("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
       int asciivalue = chr;
        System.out.println(asciivalue);
    }

}

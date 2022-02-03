import java.io.*;
public class concircle {
    static double calculateArea(int x, int y)
    {
        // Declare value of pi
        double pi = 3.1415926536;

        // Calculate area of outer circle
        double a= pi * x * x;

        // Calculate area of inner circle
        double b= pi * y * y;

        // Difference in areas
        return a - b;
    }
    public static void main (String[] args)
    {
        int x = 2;
        int y = 1;
        System.out.println (calculateArea(x, y));
    }
}



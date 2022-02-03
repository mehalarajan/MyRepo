import java.util.*;
public class cylinder {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double radius,height;
        double pi=3.14,area;
        System.out.println("Enter the Radius of Cylinder");
        radius=sc.nextDouble();
        System.out.println("Enter the Height of Cylinder");
        height=sc.nextDouble();
        area=2*pi*radius*radius+2*pi*radius*height;
        System.out.println("Area of Cylinder"+area);
    }
}

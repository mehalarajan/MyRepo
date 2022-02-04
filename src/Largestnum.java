public class Largestnum {
    public static void main(String[] args)
    {
//initializing numbers to compare
        int a=4, b=89, c=19;
//comparing numbers, a with b and a with c
//if both conditions are true, prints a
        if(a>=b && a>=c)
            System.out.println(a+" is the largest Number");
//comparing b with a and b with c
//if both conditions are true, prints b
        else if (b>=a && b>=c)
            System.out.println(b+" is the largest Number");
        else
//prints c if the above conditions are false
            System.out.println(c+" is the largest number");
    }
}

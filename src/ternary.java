public class ternary {
    public static void main(String args[])
    {
        int x=99;
        int y=98;
        int z=40;
        int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("The largest numbers is:  "+largestNumber);
    }
}

public class Gcdusingrecursion {
    public static void main(String[] args) {
        int i = 12, j = 24;
        int gcd = gcd(i, j);

        System.out.printf("G.C.D of %d and %d is %d.", i, j, gcd);
    }
    public static int gcd(int i, int j)
    {
        if (j != 0)
            return gcd(j, i % j);
        else
            return i;
    }
}

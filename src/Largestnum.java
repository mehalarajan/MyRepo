public class Largestnum {
    public static void main(String[] args) {
        int a = 4, b = 89, c = 19;
        if ( a > b) {
            if ( a > c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if ( b > c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}

public class Fibonacci {
    public static void main(String[] args) {

        int i = 1, n = 15, n1 = 0, n2 = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        while (i <= n) {
            System.out.print(n1 + ", ");
            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
            i++;
        }
    }
}

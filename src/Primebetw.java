public class Primebetw {
    public static void main(String[] args) {

        int low= 20, high = 50;
        int num=low;

        while (low< high) {
            if (checkPrimeNumber(low))
                System.out.print(low + " ");
            ++low;
        }
    }
    public static boolean checkPrimeNumber(int num) {
        boolean isprime = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }

        return isprime;
    }
}
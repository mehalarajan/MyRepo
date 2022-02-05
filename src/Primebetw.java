public class Primebetw {
    public static void main(String[] args) {

        int lowest= 20, highest = 50;

        while (lowest< highest) {
            if (checkPrimeNumber(lowest))
                System.out.print(lowest + " ");

            ++lowest;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;

        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
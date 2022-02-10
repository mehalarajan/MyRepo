public class Powerinrecursion {
    public static void main(String[] args) {

        int base = 2, power = 3;
        int result = power(base, power);
        System.out.println(base + "^" + power + "=" + result);
    }
    public static int power(int base, int power) {
        if (power==0) {
            return 1;

        }
        else {
            return (base * power(base, power - 1));
        }
    }
        }

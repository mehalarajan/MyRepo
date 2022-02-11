public class Sumofnatural {
    public static void main(String[] args) {
        int num = 20;
        int sum = naturaladd(num);
        System.out.println("Sum = " + sum);
    }
    public static int naturaladd(int num) {
        if (num != 0)
            return num + naturaladd(num - 1);
        else
            return num;
    }
}

public class reverse{
    public static void main(String[] args) {

        int num = 567, result = 0;

        System.out.println("Original Number: " + num);
        while(num != 0) {
            
            int digit = num % 10;
            result = result* 10 + digit;
            num /= 10;
        }

        System.out.println("reverse Number: " + result);
    }
}

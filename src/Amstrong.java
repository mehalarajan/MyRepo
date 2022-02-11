public class Amstrong {
    public static void main(String[] args) {
        int number = 370, originalNum, remainder, result = 0;
        originalNum = number;
        while (originalNum != 0)
        {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }}

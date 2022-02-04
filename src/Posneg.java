public class Posneg {
    static String checkPosNeg(int x)
    {

        // checks the number is greater than 0 or not
        if (x > 0)
            return "Positive";

        else if (x < 0)
            return "Negative";

        else
            return "zero";
    }

    // Driver Function
    public static void main(String[] args)
    {
        // number to be check
        int firstNumber = -98;
        System.out.println(firstNumber + " is "
                + checkPosNeg(firstNumber));
    }
}

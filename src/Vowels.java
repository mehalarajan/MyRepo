public class Vowels {
    static void Vowel_Or_Consonant(char y)
    {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u' || y == 'A' || y == 'E' || y == 'I'
                || y == 'O' || y == 'U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }

    // The Driver code
    static public void main(String[] args)
    {
        Vowel_Or_Consonant('W');
        Vowel_Or_Consonant('I');
    }
}

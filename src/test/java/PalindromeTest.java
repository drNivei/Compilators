import HomeWork1.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @Test
    public void testStringPalindromeLettersCyr(){
        Assertions.assertTrue(palindrome.isPalindrome("абба"));
    }

    @Test
    public void testStringPalindromeLettersLat(){
        Assertions.assertTrue(palindrome.isPalindrome("abba"));
    }

    @Test
    public void testStringPalindromeDigits(){
        Assertions.assertTrue(palindrome.isPalindrome("123321"));
    }


    @Test
    public void testStringPalindromeSpaces(){
        Assertions.assertTrue(palindrome.isPalindrome("а роза упала на лапу азора"));
    }

    @Test
    public void testStringPalindromeUpperCase(){
        Assertions.assertTrue(palindrome.isPalindrome("aAaAaAaA"));
    }

    @Test
    public void testStringPalindromeSpecSymb(){
        Assertions.assertTrue(palindrome.isPalindrome("a@a#$%a^a^a*a^a()!"));
    }

    @Test
    public void testStringPalindromeFail(){
        Assertions.assertFalse(palindrome.isPalindrome("asdasfhgajfh"));
    }

}

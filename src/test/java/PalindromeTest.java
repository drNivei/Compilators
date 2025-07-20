import HomeWork1.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();
    String try1 = "А роза упала на лапу Азора!";
    String try2 = "Я иду с мечем судия";
    String try3 = "топот";
    String try4 = "123321 123321";




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

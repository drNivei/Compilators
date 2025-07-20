package HomeWork1;

public class Palindrome {

    public boolean isPalindrome (String palindrome) {
        int i = 0;
        int x = palindrome.length() - 1;

        while (x > i) {
            //Skip all, except Letters and Digits
            while(!Character.isLetter(palindrome.charAt(x))) {
                if(Character.isDigit(palindrome.charAt(x))){
                    break;
                }
                x--;
            }
            while(!Character.isLetter(palindrome.charAt(i))) {
                if(Character.isDigit(palindrome.charAt(i))){
                    break;
                }
                i++;
            }

            //Compare chars and remove Upper\Lower case addiction.
            if (palindrome.charAt(x) != palindrome.charAt(i)
                    && Math.abs((int) palindrome.charAt(x) - (int) palindrome.charAt(i)) != 32) {
                return false;
            }

            i++;
            x--;
        }
        return true;
    }
}

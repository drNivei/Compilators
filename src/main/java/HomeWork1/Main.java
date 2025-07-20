package HomeWork1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Проверка строки на палиндром");
        System.out.println("Создайте метод isPalindrome(String str), который возвращает true, если строка читается одинаково с обеих сторон.");
        System.out.println("Напишите тесты для разных случаев (регистр, пробелы, спецсимволы).");
        Palindrome palindrome = new Palindrome();
        String try1 = "А роза упала на лапу Азора!";
        String try2 = "Я иду с мечем судия";
        String try3 = "топот";
        String try4 = "123321 123321";
        System.out.println("Is a "+ try1 + " a polindrome? " + palindrome.isPalindrome(try1));
        System.out.println("Is a "+ try2 + " a polindrome? " + palindrome.isPalindrome(try2));
        System.out.println("Is a "+ try3 + " a polindrome? " + palindrome.isPalindrome(try3));
        System.out.println("Is a "+ try4 + " a polindrome? " + palindrome.isPalindrome(try4));
    }
}

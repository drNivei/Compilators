package HomeWork1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Проверка строки на палиндром");
        System.out.println("Создайте метод isPalindrome(String str), который возвращает true, если строка читается одинаково с обеих сторон.");
        System.out.println("Напишите тесты для разных случаев (регистр, пробелы, спецсимволы).");
        Palindrome palindrome = new Palindrome();
        String try1 = "А роза упала на лапу Азора!";
        System.out.println("Is a "+ try1 + " a palindrome? " + palindrome.isPalindrome(try1));
    }
}

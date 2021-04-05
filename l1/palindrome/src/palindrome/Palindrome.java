package palindrome;
import java.util.Scanner;
import java.lang.String;

public class Palindrome {

    public static void main(String[] args)
    {
        System.out.println("Введите слово для проверки:");

        Scanner scan = new Scanner(System.in);
        String s=scan.next();

        isPalindrome(s);
    }

    public static String reverseString(String s)
    {

        String r = "";

        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;

    }

    public static Boolean isPalindrome(String s)
    {

        if(s.equals(reverseString(s))){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }
        return s.equals(reverseString(s));

    }

}
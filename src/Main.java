
import java.util.Scanner;

public class Main {
    public static boolean check_palindrome(String test){

        if (test.isEmpty() || test.length() == 1){
            return true;
        }else {
            if (test.charAt(0) == test.charAt(test.length() - 1)) {
                test = test.substring(1, test.length() - 1);
                return check_palindrome(test);
            }
            return false;
        }
    }


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String test = scanner.nextLine();
        test = test.toLowerCase();

        String result = check_palindrome(test)? "a palindrome" : "not a palindrome";
        System.out.println("The entered word is " + result);
    }
}
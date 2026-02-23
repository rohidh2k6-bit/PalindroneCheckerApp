import java.util.Deque;
import java.util.LinkedList;
public class PalindroneCheckerApp {
    public static void main(String[] args){
        System.out.println("==================================");
        System.out.println(" Welcome to Palindrome Checker App");
        System.out.println(" Version : 1.0");
        System.out.println("==================================");

        String word = "refer";

        Deque<Character> deque = new LinkedList<>();

        // insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // compare front and rear characters
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}

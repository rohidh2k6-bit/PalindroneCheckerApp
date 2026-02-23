import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindroneCheckerApp {
    public static void main(String[] args){
        System.out.println("==================================");
        System.out.println(" Welcome to Palindrome Checker App");
        System.out.println(" Version : 1.0");
        System.out.println("==================================");

        String word = "level";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // enqueue and push characters
        for (int i = 0; i < word.length(); i++) {
            queue.add(word.charAt(i));
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // compare dequeue (FIFO) with pop (LIFO)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
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

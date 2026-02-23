public class PalindroneCheckerApp {
    public static void main(String[] args){
        System.out.println("==================================");
        System.out.println(" Welcome to Palindrome Checker App");
        System.out.println(" Version : 1.0");
        System.out.println("==================================");

        // reverse the string
        String word = "radar";

        // convert string to character array
        char[] chars = word.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}

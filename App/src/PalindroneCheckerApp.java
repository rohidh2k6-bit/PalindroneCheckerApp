public class PalindroneCheckerApp {
    public static void main(String[] args){
        System.out.println("==================================");
        System.out.println(" Welcome to Palindrome Checker App");
        System.out.println(" Version : 1.0");
        System.out.println("==================================");
        String word = "madam";   // hardcoded string
        String reverse = "";

        // reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // check palindrome
        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}

public class PalindroneCheckerApp {
    public static void main(String[] args){
        System.out.println("==================================");
        System.out.println(" Welcome to Palindrome Checker App");
        System.out.println(" Version : 1.0");
        System.out.println("==================================");
        String word = "madam";   // hardcoded string
        String reverse = "";

        // reverse the string
        String original = "level";
        String reversed = "";

        // reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}

class PalindroneChecker {

    public boolean checkPalindrone(String input) {

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        PalindroneChecker service = new PalindroneChecker();

        String input = "Never Odd Or Even";

        if (service.checkPalindrone(input))
            System.out.println("Palindrone");
        else
            System.out.println("Not a Palindrone");
    }
}

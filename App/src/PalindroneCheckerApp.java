interface PalindroneStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindroneStrategy {

    public boolean check(String input) {

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] stack = new char[cleaned.length()];
        int top = -1;

        for (int i = 0; i < cleaned.length(); i++) {
            stack[++top] = cleaned.charAt(i);
        }

        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack[top--])
                return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindroneStrategy {

    public boolean check(String input) {

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

    private PalindroneStrategy strategy;

    public PalindroneCheckerApp(PalindroneStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrone(String input) {
        return strategy.check(input);
    }

    public static void main(String[] args) {

        PalindroneStrategy strategy = new StackStrategy();
        PalindroneCheckerApp app = new PalindroneCheckerApp(strategy);

        String input = "Able was I ere I saw Elba";

        if (app.checkPalindrone(input))
            System.out.println("Palindrone");
        else
            System.out.println("Not a Palindrone");
    }
}
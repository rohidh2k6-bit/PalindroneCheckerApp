public class PalindroneCheckerApp {

    static boolean iterativeCheck(String input) {

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

    static boolean recursiveCheck(String input, int start, int end) {

        if (start >= end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        return recursiveCheck(input, start + 1, end - 1);
    }

    static boolean stackCheck(String input) {

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] stack = new char[cleaned.length()];
        int top = -1;

        for (int i = 0; i < cleaned.length(); i++)
            stack[++top] = cleaned.charAt(i);

        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack[top--])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "Able was I ere I saw Elba";
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        long startTime, endTime;

        startTime = System.nanoTime();
        iterativeCheck(input);
        endTime = System.nanoTime();
        System.out.println("Iterative Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        recursiveCheck(cleaned, 0, cleaned.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursive Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stackCheck(input);
        endTime = System.nanoTime();
        System.out.println("Stack Time: " + (endTime - startTime) + " ns");
    }
}
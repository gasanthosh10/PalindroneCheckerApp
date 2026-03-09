import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two Pointer
    public static boolean twoPointer(String text) {

        String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int start = 0;
        int end = cleaned.length() - 1;

        while(start < end) {
            if(cleaned.charAt(start) != cleaned.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    // Method 2: Stack
    public static boolean stackMethod(String text) {

        String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for(char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return cleaned.equals(reversed);
    }

    // Method 3: Reverse String
    public static boolean reverseMethod(String text) {

        String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Two Pointer Performance
        long start1 = System.nanoTime();
        boolean result1 = twoPointer(input);
        long end1 = System.nanoTime();

        // Stack Performance
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Reverse Method Performance
        long start3 = System.nanoTime();
        boolean result3 = reverseMethod(input);
        long end3 = System.nanoTime();

        System.out.println("Input: " + input);
        System.out.println();

        System.out.println("Two Pointer Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Reverse Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}
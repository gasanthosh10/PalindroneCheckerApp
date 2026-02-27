import java.util.Stack;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Step 1: Original string
        String word = "madam";

        // Step 2: Create stack
        Stack<Character> stack = new Stack<>();

        // Step 3: Push characters into stack
        for(int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Step 4: Pop and build reversed string
        String reversed = "";

        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Step 5: Compare original and reversed
        if(word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a PALINDROME.");
        }
        else {
            System.out.println("The string \"" + word + "\" is NOT a palindrome.");
        }
    }
}
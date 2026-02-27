import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Step 1: Original string
        String word = "madam";

        // Step 2: Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Step 3: Insert characters into both
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        // Step 4: Compare dequeue and pop
        boolean isPalindrome = true;

        for(int i = 0; i < word.length(); i++) {

            char fromQueue = queue.remove(); // FIFO
            char fromStack = stack.pop();    // LIFO

            if(fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Step 5: Display result
        if(isPalindrome) {
            System.out.println("The string \"" + word + "\" is a PALINDROME.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a palindrome.");
        }
    }
}
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String text);
}

// Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {

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
}

// Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {

        String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : cleaned.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {

            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String text) {
        return strategy.checkPalindrome(text);
    }
}

// Main Application
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam";

        // Choose algorithm dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.execute(input);

        if(result) {
            System.out.println("\"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}
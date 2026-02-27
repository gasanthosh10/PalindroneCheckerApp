import java.util.Deque;
import java.util.ArrayDeque;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Step 1: Input string
        String word = "racecar";

        // Step 2: Create deque
        Deque<Character> deque = new ArrayDeque<>();

        // Step 3: Insert characters
        for(int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        // Step 4: Compare front and rear
        boolean isPalindrome = true;

        while(deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if(front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Step 5: Print result
        if(isPalindrome) {
            System.out.println("The string \"" + word + "\" is a PALINDROME.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a palindrome.");
        }
    }
}
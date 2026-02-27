
public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Step 1: Original String
        String text = "radar";

        // Step 2: Convert string to character array
        char[] characters = text.toCharArray();

        // Step 3: Two pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while(start < end) {

            if(characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Step 4: Display result
        if(isPalindrome) {
            System.out.println("The string \"" + text + "\" is a PALINDROME.");
        }
        else {
            System.out.println("The string \"" + text + "\" is NOT a palindrome.");
        }
    }
}
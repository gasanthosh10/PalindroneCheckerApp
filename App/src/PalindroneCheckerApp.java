
public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Step 1: Original String
        String original = "level";

        // Step 2: Empty string to store reverse
        String reversed = "";

        // Step 3: Reverse using for loop
        for(int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Step 4: Compare strings
        if(original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a PALINDROME.");
        }
        else {
            System.out.println("The string \"" + original + "\" is NOT a palindrome.");
        }
    }
}
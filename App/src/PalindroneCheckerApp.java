public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Step 1: Hardcoded string
        String word = "madam";

        // Step 2: Variable to store reversed string
        String reverse = "";

        // Step 3: Reverse the string using loop
        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // Step 4: Compare original and reversed
        if(word.equals(reverse)) {
            System.out.println("The given word \"" + word + "\" is a PALINDROME.");
        }
        else {
            System.out.println("The given word \"" + word + "\" is NOT a palindrome.");
        }

    }
}

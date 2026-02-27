public class PalindroneCheckerApp {

    // Recursive function
    static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if(start >= end)
            return true;

        // If mismatch
        if(str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call (move inward)
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if(result)
            System.out.println("The string \"" + word + "\" is a PALINDROME.");
        else
            System.out.println("The string \"" + word + "\" is NOT a palindrome.");
    }
}
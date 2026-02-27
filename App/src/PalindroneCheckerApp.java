public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Step 1: Original input
        String input = "A man a plan a canal Panama";

        // Step 2: Normalize string
        // remove spaces & special characters, convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Step 3: Check palindrome using two-pointer
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while(start < end) {

            if(normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Step 4: Display result
        if(isPalindrome) {
            System.out.println("\"" + input + "\" is a PALINDROME (ignoring case & spaces).");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}
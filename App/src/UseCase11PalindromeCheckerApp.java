public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Nurses Run";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if(result) {
            System.out.println("\"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}
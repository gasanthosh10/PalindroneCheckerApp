public class PalindromeChecker {

    public boolean checkPalindrome(String text) {

        String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int start = 0;
        int end = cleaned.length() - 1;

        while(start < end) {

            if(cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
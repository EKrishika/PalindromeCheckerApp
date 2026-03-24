// UC4: Character Array Based Palindrome Check

public class UseCase4PalindromeCheckerApp {

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Original string
        String input = "radar";

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}

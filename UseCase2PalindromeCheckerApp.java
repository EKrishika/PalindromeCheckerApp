// UC2: Print a Hardcoded Palindrome Result

public class UseCase2PalindromeCheckerApp {

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        // Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check if palindrome using if-else
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}

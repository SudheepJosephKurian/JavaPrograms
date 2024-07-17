package InterviewQs;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is " + input + " a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

//Explanation:
//
//The isPalindrome method checks if a string is a palindrome.
//It uses two pointers, left starting from the beginning and right from the end, and compares the characters at these positions.
//If all characters match as the pointers move towards the center, it returns true; otherwise, false.
//The main method tests this with the string "racecar" and prints whether it is a palindrome.

package InterviewQs;

public class reverse_string {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
}

/*Explanation:

The program defines a method reverseString which uses StringBuilder to reverse the input string.
StringBuilder is used because it has a built-in method reverse() that efficiently reverses the string.
The main method tests the reverseString method with the input "Hello, World!" and prints the reversed string.
 */
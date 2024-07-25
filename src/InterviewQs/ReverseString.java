package InterviewQs;

public class ReverseString {
    public static void main(String[] args) {
        String inputStr = "Hello, World!";
        String reversedStr = "";
        char[] charArray = inputStr.toCharArray();


        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedStr += charArray[i];
        }

        System.out.println("Reversed String: " + reversedStr);
    }
}

/*Explanation:
public static void main(String[] args): The main method where the program execution begins.
String inputStr = "Hello, World!";: Initializes the input string.
char[] charArray = inputStr.toCharArray();: Converts the input string to a character array.
String reversedStr = "";: Initializes an empty string to store the reversed string.
for (int i = charArray.length - 1; i >= 0; i--): A loop that iterates from the end of the character array to the beginning.
reversedStr += charArray[i];: Appends each character from the end of the array to the beginning, effectively reversing the string.
System.out.println("Reversed String: " + reversedStr);: Prints the reversed string to the console.
 */
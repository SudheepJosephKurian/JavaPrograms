package InterviewQs;

public class VowelCounter {
    public static void main(String[] args) {
        String inputStr = "Hello, World!";
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < inputStr.length(); i++) {
            if (vowels.indexOf(inputStr.charAt(i)) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}

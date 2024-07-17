package InterviewQs;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
//Explanation:
//
//The generateFibonacci method generates and prints the first n Fibonacci numbers.
//It starts with the first two numbers, 0 and 1.
//It then iterates to generate the next numbers by summing the previous two, updating the variables accordingly.
//The main method calls this function with n set to 10, printing the first 10 Fibonacci numbers.

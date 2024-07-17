package InterviewQs;

public class Prime_number {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = isPrime(num);
        System.out.println(num + " is prime: " + isPrime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/* Explanation:

The program includes a method isPrime to check if a number is prime.
It first handles the case where numbers less than or equal to 1 are not prime.
It then checks for factors from 2 up to the square root of the number to determine if it is divisible by any of them.
The main method checks if 29 is prime and prints the result.

 */
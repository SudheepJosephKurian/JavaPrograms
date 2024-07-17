package InterviewQs;

public class MaxElement {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int max = findMax(numbers);
        System.out.println("Maximum element: " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

//Explanation:
//
//The program defines a method findMax to find the maximum element in an array.
//It initializes the max variable to the first element of the array.
//It then iterates through the array, updating max whenever it finds a larger element.
//The main method tests this by finding and printing the maximum element in the array {3, 5, 7, 2, 8}.
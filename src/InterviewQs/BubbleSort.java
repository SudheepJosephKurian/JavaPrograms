package InterviewQs;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        bubbleSort(numbers);
        System.out.println("Sorted array: " + java.util.Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

//Explanation:
//
//The bubbleSort method sorts an array using the bubble sort algorithm.
//It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
//This process is repeated until the list is sorted.
//The main method tests this with the array {5, 2, 9, 1, 5, 6} and prints the sorted array.
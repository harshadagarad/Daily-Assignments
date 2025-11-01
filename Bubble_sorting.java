package utility;

public class BubbleSort {

    // Method to perform bubble sort on an integer array
    void bubbleSort(int arr[]) {
        int n = arr.length;
        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons and swaps within each pass
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if elements are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the bubble sort implementation
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting:");
        ob.printArray(arr);

        ob.bubbleSort(arr);

        System.out.println("Array after sorting:");
        ob.printArray(arr);
    }
}

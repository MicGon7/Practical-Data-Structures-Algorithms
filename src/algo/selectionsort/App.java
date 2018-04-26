package algo.selectionsort;

public class App {
    public static void main(String[] args) {
        displayArray(selectionSort(new int[]{25, 47, 3, 19, 8, 18}));
    }

    public static int[] selectionSort(int[] a) {
        // O(n^2)
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int minimumValueIndex = findMinimumValueIndex(a, i);
            // Once the index for the minimum value is found -
            // swap it with the element at the current index.
            int temp = a[i]; // temporarily store the value at the current index.
            a[i] = a[minimumValueIndex]; // set element at current index to the value at the minimum index .
            a[minimumValueIndex] = temp; // set the element at the minimum index to the value at the current index.

            // Swap is O(n). The amount of swaps operations depends on the number(n) of elements in the array.
        }

        return a;
    }

    public static int findMinimumValueIndex(int[] a, int startIndex) {
        // Control our boundaries between sorted and unsorted by shifting the selection start point
        // one element to the right after each swap is completed.
        int minimumValueIndex = startIndex;
        // j = i + 1 -> compares the element at i to the next element over.
        for (int j = startIndex + 1; j < a.length; j++) {
            // if the value at the next element over is less, store its index as the minimumValueIndex;
            if (a[j] < a[minimumValueIndex]) {
                minimumValueIndex = j;
            }
        }

        return minimumValueIndex;
    }

    public static void displayArray(int[] a) {
        System.out.print("[ ");
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.print("]");
    }
}


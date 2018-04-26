package algo.searching;

public class ArrayLearner {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 5, 6, 9, 11};
        System.out.println("Max: " + findMaxValue(myArray));
        System.out.println("Min: " + findMinValue(myArray));
        System.out.println("MaxProduct: " + findMaxProduct(myArray));
        System.out.println("LinearSearch: " + linearSearch(myArray, 9));
        System.out.println("BinarySearch: " + binarySearch(myArray, 11));
    }

    public static int findMaxValue(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] > max) max = a[i];

        return max;
    }

    public static int findMinValue(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] < min) a[i] = min;

        return min;
    }

    public static int findMaxProduct(int[] arr) {

        if (arr.length < 2) {
            System.out.println("No pairs exist");
        }

        // Initialize max product pair;
        int a = arr[0], b = arr[1];

        // Traverse through every possible pair
        // and keep track of max product;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] * arr[j] > a * b) {
                    a = arr[i];
                    b = arr[j];
                }
            System.out.println("Max product pair is {" + a + ", " + b + " }");
        }

        return a * b;
    }

    public static int linearSearch(int[] a, int x) { // O(n)

        for(int i = 0; i < a.length; i++) {
            if(a[i] == x) return i;
        }

        return -1;
    }

    public static int binarySearch(int[] a, int x) { // O(log n)
        int low = 0;
        int high = a.length;

        while (low <= high) {
            int mid = (low + high) / 2; // Get the mid point of the array.
            if (x < a[mid]) high = mid - 1;
            else if(x > a[mid]) low = mid + 1;
            else return mid;
        }
        return -1;

    }
}

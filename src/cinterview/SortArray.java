package cinterview;

public class SortArray {
    public static void main(String[] args) {
        displayArray(combineArray(new int[] { 1, 3, 4, 5}, new int[] {2, 4, 6, 8}));

    }

    public static int[] combineArray(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length)
            result[k++] = a[i] < b[j] ? a[i++] : b[j++];

        while(i < a.length)
            result[k++] = a[i++];

        while (j < b.length)
            result[k++] = b[j++];

        return result;

    }

    public static void displayArray(int[] a) {
        System.out.print("[ ");
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.print("]");
    }
}

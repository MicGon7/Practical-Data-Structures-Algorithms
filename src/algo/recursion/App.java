package algo.recursion;

public class App {
    public static void main(String[] args) {
        //reduceByOne(10);

        //System.out.println(linearSearch(new int[]{2, 5, 6, 10, 15}, 0, 15));
        System.out.println(binarySearch(new int[]{2, 4, 6, 8, 10, 12, 14, 16}, 0, 8, 16));
    }

    public static void reduceByOne(int n) {
        if (n >= 0) {

            reduceByOne(n - 1);
        }

        System.out.println("Completed Call: " + n);
    }

    public static int linearSearch(int[] a, int i, int x) {
        if (i > a.length - 1) return -1;
        else if (a[i] == x) return i;
        else {
            System.out.println("Index at: " + i);
            return linearSearch(a, i + 1, x);
        }
    }

    public static int binarySearch(int[] a, int p, int r, int x) {
        System.out.println("[ " + p + "..." + r + " ]");
        if (p > r) return -1;
        int q = (p + r) / 2;
        if(a[q] == x) return q;
        else if (a[q] > x) return binarySearch(a, p, q-1, x);
        else return binarySearch(a, q+1, r, x);
    }
}

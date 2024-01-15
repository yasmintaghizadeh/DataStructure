package maximum;

public class RecursiveMax {
    public static int recursiveMax(int[] arr,int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max( recursiveMax(arr, n - 1),n-1);
    }
}

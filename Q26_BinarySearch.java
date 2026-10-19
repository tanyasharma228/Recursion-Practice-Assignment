import java.util.Scanner;

public class Q26_BinarySearch {
    static int binarySearchFirst(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            int earlier = binarySearchFirst(arr, target, left, mid - 1);
            return earlier != -1 ? earlier : mid;
        }
        if (arr[mid] < target) {
            return binarySearchFirst(arr, target, mid + 1, right);
        }
        return binarySearchFirst(arr, target, left, mid - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(binarySearchFirst(arr, target, 0, n - 1));
        sc.close();
    }
}

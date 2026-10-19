import java.util.Scanner;

public class Q25_LinearSearch {
    static int search(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return search(arr, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(search(arr, target, 0));
        sc.close();
    }
}

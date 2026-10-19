import java.util.Scanner;

public class Q3_PrintEvenNumbers {
    static void printEven(int n) {
        if (n < 2) return;
        printEven(n - 1);
        if (n % 2 == 0) System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(n);
        System.out.println();
        sc.close();
    }
}

import java.util.Scanner;

public class Q9_ReverseNumber {
    static long reverse(long n, long result) {
        if (n == 0) return result;
        return reverse(n / 10, result * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(reverse(n, 0));
        sc.close();
    }
}

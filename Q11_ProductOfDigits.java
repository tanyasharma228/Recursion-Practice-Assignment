import java.util.Scanner;

public class Q11_ProductOfDigits {
    static long productDigits(long n) {
        if (n < 10) return n;
        return (n % 10) * productDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(productDigits(n));
        sc.close();
    }
}

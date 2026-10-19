import java.util.Scanner;

public class Q17_DecimalToBinary {
    static void printBinary(long n) {
        if (n > 1) printBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        printBinary(n);
        System.out.println();
        sc.close();
    }
}

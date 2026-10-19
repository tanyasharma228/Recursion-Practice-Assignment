import java.util.Scanner;

public class Q7_ReverseString {
    static void reverse(String s, int index) {
        if (index < 0) return;
        System.out.print(s.charAt(index));
        reverse(s, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverse(s, s.length() - 1);
        System.out.println();
        sc.close();
    }
}

import java.util.Scanner;

public class Q21_ReplaceCharacter {
    static String replace(String s, char oldChar, char newChar, int index) {
        if (index == s.length()) return "";
        char current = s.charAt(index) == oldChar ? newChar : s.charAt(index);
        return current + replace(s, oldChar, newChar, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] chars = sc.nextLine().trim().split("\\s+");
        char oldChar = chars[0].charAt(0);
        char newChar = chars[1].charAt(0);
        System.out.println(replace(s, oldChar, newChar, 0));
        sc.close();
    }
}

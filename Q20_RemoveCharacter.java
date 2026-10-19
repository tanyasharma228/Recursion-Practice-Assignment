import java.util.Scanner;

public class Q20_RemoveCharacter {
    static String remove(String s, char target, int index) {
        if (index == s.length()) return "";
        String rest = remove(s, target, index + 1);
        if (s.charAt(index) == target) return rest;
        return s.charAt(index) + rest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char target = sc.nextLine().charAt(0);
        System.out.println(remove(s, target, 0));
        sc.close();
    }
}

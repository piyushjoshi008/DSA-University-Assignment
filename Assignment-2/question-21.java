import java.util.Scanner;
public class Main {
    public static String replaceChar(String s, char c1, char c2, int index) {
        if (index == s.length()) return "";
        char current = (s.charAt(index) == c1) ? c2 : s.charAt(index);
        return current + replaceChar(s, c1, c2, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String chars = sc.nextLine();
        char c1 = chars.charAt(0);
        char c2 = chars.charAt(2);
        System.out.println(replaceChar(s, c1, c2, 0));
    }
}

import java.util.Scanner;
public class Main {
    public static String reverseStr(String s) {
        if (s.isEmpty()) return s;
        return reverseStr(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseStr(s));
    }
}

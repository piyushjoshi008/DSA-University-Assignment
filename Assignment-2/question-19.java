import java.util.Scanner;
public class Main {
    public static int countChar(String s, char c, int index) {
        if (index == s.length()) return 0;
        int count = (s.charAt(index) == c) ? 1 : 0;
        return count + countChar(s, c, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.println(countChar(s, c, 0));
    }
}

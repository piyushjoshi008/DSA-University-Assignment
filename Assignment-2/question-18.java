import java.util.Scanner;
public class Main {
    public static int toDecimal(String s, int index) {
        if (index < 0) return 0;
        int bit = s.charAt(index) - '0';
        return bit * (int)Math.pow(2, s.length() - 1 - index) + toDecimal(s, index - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toDecimal(s, s.length() - 1));
    }
}

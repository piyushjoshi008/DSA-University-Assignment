import java.util.Scanner;
public class Main {
    public static void reverseNum(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }
        System.out.print(n % 10);
        reverseNum(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNum(n);
    }
}

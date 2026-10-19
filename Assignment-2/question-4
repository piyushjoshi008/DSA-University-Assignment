import java.util.Scanner;
public class Main {
    public static void printOdd(int current, int n) {
        if (current > n) return;
        if (current % 2 != 0) System.out.print(current + " ");
        printOdd(current + 1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOdd(1, n);
    }
}

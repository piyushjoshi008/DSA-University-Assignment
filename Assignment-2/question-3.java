import java.util.Scanner;
public class Main {
    public static void printEven(int current, int n) {
        if (current > n) return;
        if (current % 2 == 0) System.out.print(current + " ");
        printEven(current + 1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(1, n);
    }
}

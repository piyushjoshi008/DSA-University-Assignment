import java.util.Scanner;
public class Main {
    public static int binarySearchFirst(int[] arr, int target, int low, int high, int result) {
        if (low > high) return result;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return binarySearchFirst(arr, target, low, mid - 1, mid); 
        } else if (arr[mid] < target) {
            return binarySearchFirst(arr, target, mid + 1, high, result);
        } else {
            return binarySearchFirst(arr, target, low, mid - 1, result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(binarySearchFirst(arr, target, 0, arr.length - 1, -1));
    }
}

import java.util.Scanner;

public class PrimeCheckerOptimized {

    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if (isPrimeOptimized(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

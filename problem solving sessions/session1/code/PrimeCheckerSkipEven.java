import java.util.Scanner;

public class PrimeCheckerSkipEven {

    public static boolean isPrimeSkipEven(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i < n; i += 2) {
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
        
        if (isPrimeSkipEven(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

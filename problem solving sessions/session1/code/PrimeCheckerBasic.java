import java.util.Scanner;

public class PrimeCheckerBasic {

    public static boolean isPrimeBasic(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
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
        
        if (isPrimeBasic(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

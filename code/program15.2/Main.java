import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean password_is_wrong = true;

        while (password_is_wrong) {
            System.out.println("Enter password");
            int password = scanner.nextInt();
            password_is_wrong = password != 456;
        }
    }
}

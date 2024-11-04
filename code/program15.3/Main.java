import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int password;
        do {
            System.out.println("Enter password");
            password = scanner.nextInt();
        } while(password != 456);

        System.out.println("Password is correct");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Password");
        int password = scanner.nextInt();
        while (password != 456) { // 456 is the correct password.
            System.out.println("Enter Password");
            password = scanner.nextInt();   
        }
        System.out.println("Correct!");
    }
}
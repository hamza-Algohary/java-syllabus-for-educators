import java.util.Scanner;
public class Shape2
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int curr_space = x - 1;
        int numOfStars = 1;
        for(int i = 0 ; i < x ; i++){
            
            for(int j = 0 ; j < curr_space; j++){
                System.out.print(" ");
            }
            curr_space--;
            
            for(int k = 0 ; k < numOfStars ; k++){
                System.out.print("*");
            }
            
            numOfStars += 2;
            
            System.out.println();
            
        }
	}
}


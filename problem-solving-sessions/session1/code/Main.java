import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 4;
		
		int counter = n ; // 4 3 2 1
		for(int i = 0 ; i < n ; i++){
		    
		   // print * for each row
		   for(int j = 0 ; j < counter ; j++){ // counter = 4 
		       System.out.print("*");
		   } 
		    
		    System.out.println();
	        counter--;
		}
	}
}
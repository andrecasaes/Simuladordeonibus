import java.io.IOException;
import java.util.Scanner;

public class ex1001 {
 
    public static void main(String[] args) throws IOException {
	Scanner reader = new Scanner(System.in); 
	    int A = reader.nextInt();
	    int B = reader.nextInt();
	    int X = A+B;

	System.out.println("X = " + X);
	reader.close();
    }
 
}
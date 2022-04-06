import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		try {
		Scanner scanner = new Scanner(new File("test13.txt"));
			int [] tall = new int [100];
			int i = 0;
			while(scanner.hasNextInt()){
			tall[i++] = scanner.nextInt();
			}
		}
		catch (NumberFormatException ex) {
			e.printStackTrace(); 
		}
		
	}

}

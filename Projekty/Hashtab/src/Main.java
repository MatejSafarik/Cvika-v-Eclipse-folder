import java.util.*;
import java.io.*;

public class Main {

	
	String [] theArray;
	int arraySize;
	int itemsInArray = 0;
	
	
	public static void main(String[] args) {
		System.out.println("Som v Heshi");
		
        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();
  
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>();
  
        // Inserting the Elements
        // using put() method
        ht1.put(1, "test1");
        ht1.put(2, "testTwo");
        ht1.put(3, "three");
  
        ht2.put(4, "4");
        ht2.put(5, "pat");
        ht2.put(6, "devet");
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
		
	}

}

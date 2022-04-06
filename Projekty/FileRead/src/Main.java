import java.io.*; 
 
public class Main {
public static void main(String[] args) {
	int counter = 0;
	try  
	{  
	File file=new File("test13.txt");    //creates a new file instance  
	FileReader fr=new FileReader(file);   //reads the file  
	BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
	StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  

	String line;  
	while((line=br.readLine())!=null)  
	{  
	sb.append(line);      //appends line to string buffer  
	//sb.append("\n");     //line feed  

	counter++;
	System.out.println("kolo "+counter); 
	System.out.println("SB drzim "+sb); 
	System.out.println("line drzim "+line); 
	}  
	fr.close();    //closes the stream and release the resources  
	System.out.println("Contents of File: ");  
	System.out.println(sb.toString());   //returns a string that textually represents the object  
	}  
	catch(IOException e)  
	{  
	e.printStackTrace();  
	}  
	}  
	}  
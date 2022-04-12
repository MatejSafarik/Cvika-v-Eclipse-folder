package application;

//dedenie
public class Petroleum extends Resources{

	String Composition;
	
	
	public void petroleumStuff1(Integer amount, String type) {
	    System.out.println("Vytvorila sa aukcia na "+amount+" petrolea typu "+type);
	  }
	public void petroleumStuff1(Integer amount) {
	    System.out.println("Vytvorila sa aukcia na "+amount+" petrolea");
	  }
	
}

//import java.util.

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		Headphones h = new Headphones();

		//sysout + ctrl + space
		String test = JOptionPane.showInputDialog("Chceö n·m nieËo povedaù?");
		JOptionPane.showMessageDialog(null, "Tvoja sprava bola: "+test);
		System.out.println("\t\"My headphones.\"\n");
		System.out.println("farba je "+h.color);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Aku farbu chces?");
		h.color = scanner.nextLine();
		System.out.println("farba je "+h.color);
		System.out.println("zariadenie je zapnute- "+h.power);
		h.powerOn();
		System.out.println("zariedenie je zapnute- "+h.power);
		System.out.println("aktualna hlasitost "+h.volume);
		System.out.println("Na kolko mam pridat zvuk?");
		int ii = scanner.nextInt();
		for (int i = 0; i < ii; i++) {
			  h.volumeUp();
			}
		System.out.println("aktualna hlasitost "+h.volume);
		System.out.println(Arrays.toString(h.controls));
		
	}

}

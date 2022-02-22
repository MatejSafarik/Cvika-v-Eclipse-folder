

public class BadOgre2 extends BadOgre {	   
	void revenge(Knight knight) {
		if (hungry) {} else
			eat(knight);
	}
	void eat(Knight knight) {
		knight.energy = 0;
	}

}



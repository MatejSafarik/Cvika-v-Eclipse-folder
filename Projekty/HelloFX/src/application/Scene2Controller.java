package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {

	@FXML
	Label vitajLabel;
	
	public void displayName(String username) {
		vitajLabel.setText("Vitaj " + username+".");
	}

}

//daj ma do view

package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {

	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	
	 @FXML
	 TextField loginTextField;
	 
	 @FXML
	 PasswordField loginPasswordField;
	 
	 @FXML
	 Label loginLabel;
	 

	 
	 public void switchToScene1(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void login(ActionEvent event) throws IOException {
		 
		 String username = loginTextField.getText();
		 String password = loginPasswordField.getText();
		 
		 if (username.equals("login")) {

			 if (password.equals("password")) {
				 
				  
				  FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));	
				  root = loader.load();	

				  Scene2Controller scene2Controller = loader.getController();
				  scene2Controller.displayName(username);
				  
				  //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
				  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				  scene = new Scene(root);
				  stage.setScene(scene);
				  stage.show();

				 }
			 else{loginLabel.setText("Nespravne udaje");}
		 
		 }
		 else{loginLabel.setText("Nespravne udaje");}
		 

		 }
	
	public void button1(ActionEvent e) {
		System.out.println("Enter");
	}
	
}

package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene2Controller implements Initializable{

	Integer money = 1000;
	
	@FXML
	private Label vitajLabel;
	
	@FXML
	private Label moneyLabel;
	
	@FXML
	private ChoiceBox<String> auctionChoiceBox;
	private String[] comodity = {"-","Petroleum"};
	
	@FXML
	private Label compositionLabel;
	
	@FXML
	private TextField amountTextField;
	@FXML
	private TextField typeTextField;
	@FXML
	private TextField countryTextField;
	@FXML
	private TextField yearTextField;
	@FXML
	private TextField compositionTextField;


	
	public void displayName(String username) {
		vitajLabel.setText("Vitaj " + username+".");
		moneyLabel.setText("Aktuane zdroje: "+money+" €");
	}

	 public void createAuction(ActionEvent event) throws IOException {

		 String Test = auctionChoiceBox.getValue();
		 if (Test.equals("Petroleum")) {System.out.println("preslo");
		 

				Petroleum pet1 = new Petroleum();
				pet1.Amount = Integer.parseInt(amountTextField.getText());
				pet1.OriginCountry=countryTextField.getText();
				pet1.OriginYear=yearTextField.getText();
				pet1.Type=typeTextField.getText();
				pet1.Composition=compositionTextField.getText();
				//polymorfizmus orvelodovanie
				pet1.petroleumStuff1(pet1.Amount);
				pet1.petroleumStuff1(pet1.Amount, pet1.Type);

		 
		 }
			else{System.out.println("nepreslo");
			
			}
		 
		 }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		auctionChoiceBox.getItems().addAll(comodity);



	}
	
	public void auctionAdditionalEnable() {
		// tato cast aktualne nefunguje
		/*
		try {
			String Test = auctionChoiceBox.getValue();
			if (Test.equals("Petroleum")) {compositionTextField.setDisable(true);compositionLabel.setDisable(true);}
			else{compositionTextField.setDisable(false);compositionLabel.setDisable(false);}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		compositionTextField.setDisable(false);compositionLabel.setDisable(false);
	}
}

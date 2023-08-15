package dev.skyherobrine.controllers.comboBox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ComboBoxApplication extends Application implements Initializable{

	@FXML
	private Label title;
	
	@FXML
	private ComboBox<String> comboBox;
	
	private String[] listNames = {"John", "Marry", "Harry", "Lynn"};
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		title.setAlignment(Pos.CENTER);
		comboBox.getItems().setAll(listNames);
	}
	
	public void chooseItem(ActionEvent event) {
		title.setText(comboBox.getSelectionModel().getSelectedItem());
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = FXMLLoader.load(ComboBoxApplication.class.getResource("combo-box.fxml"));
		stage.setScene(new Scene(pane));
		stage.setTitle("Controller ComboBox");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

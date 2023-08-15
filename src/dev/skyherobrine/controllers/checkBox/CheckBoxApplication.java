package dev.skyherobrine.controllers.checkBox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CheckBoxApplication extends Application implements Initializable{

	@FXML
	private Label title;
	
	@FXML
	private CheckBox checkBox;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		title.setAlignment(Pos.CENTER);
	}
	
	public void isChecked(ActionEvent event) {
		if(checkBox.isSelected())
			title.setText("You checked the box");
		else {
			title.setText("You unchecked the box");
		}
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane loader = FXMLLoader.load(CheckBoxApplication.class.getResource("check-box.fxml"));
		stage.setScene(new Scene(loader));
		stage.setTitle("Controller CheckBox");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

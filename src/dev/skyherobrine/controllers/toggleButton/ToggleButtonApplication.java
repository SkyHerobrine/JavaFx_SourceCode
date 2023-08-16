package dev.skyherobrine.controllers.toggleButton;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ToggleButtonApplication extends Application implements Initializable {

	@FXML
	private Label title;
	
	@FXML
	private ToggleButton toggleButton;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		title.setAlignment(Pos.CENTER);
	}
	
	public void pressButton(ActionEvent event) {
		if(toggleButton.isSelected())
			title.setText("Clicked!");
		else title.setText("Unclicked!");
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = FXMLLoader.load(ToggleButtonApplication.class.getResource("toggle-button.fxml"));
		stage.setScene(new Scene(pane));
		stage.setTitle("Controller Toggle Button");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

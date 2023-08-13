package dev.skyherobrine.controllers.button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonApplication extends Application{
	
	@FXML
	private Label title;
	@FXML
	private Button buttonPress;
	
	private int count = 0;
	
	public void clickedButton(ActionEvent event) {
		++count;
		title.setText(count + "");
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane loader = FXMLLoader.load(ButtonApplication.class.getResource("button.fxml"));
		stage.setScene(new Scene(loader));
		stage.setTitle("Controller Button");
		stage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

package dev.skyherobrine.controllers.textField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TextFieldApplication extends Application{

	@FXML
	private TextField textField;
	
	@FXML
	private Label title;
	
	/**
	 * Gắn sự kiện khi người dùng nhấn Enter nó sẽ kích hoạt sự kiện
	 * @param event
	 */
	public void clicked(ActionEvent event) {
		title.setText(textField.getText());
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = (Pane) FXMLLoader.load(TextFieldApplication.class.getResource("text-field.fxml"));
		stage.setScene(new Scene(pane));
		stage.setTitle("Controller Text-Field");
		stage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

package dev.skyherobrine.controllers.datePicker;

import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DatePickerApplication extends Application {

	@FXML
	private Label title;
	
	@FXML
	private DatePicker datePicker;
	
	public void chooseDate(ActionEvent event) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MMM - yyyy");
		title.setText(formatter.format(datePicker.getValue()));
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = FXMLLoader.load(DatePickerApplication.class.getResource("date-picker.fxml"));
		stage.setScene(new Scene(pane));
		stage.setTitle("Controller DatePicker");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

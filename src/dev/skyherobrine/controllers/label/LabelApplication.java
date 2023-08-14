package dev.skyherobrine.controllers.label;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelApplication extends Application implements Initializable {

	@FXML
	private Label title;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("It's running!");
		title.setAlignment(Pos.CENTER);	//Căn chỉnh lề của nội dung chữ của label
		title.setTextFill(Color.BLACK);	//Đặt màu chữ cho label
		title.setFont(new Font("Segoe UI", 30)); //Đặt font chữ và kích cỡ chữ
		title.setBorder(Border.stroke(Color.YELLOW));  //Dặt vùng border bên ngoài là màu gì
		title.setText("THIS IS TITLE!");  //Đặt nội dung chữ của Label
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane loader = FXMLLoader.load(LabelApplication.class.getResource("label.fxml"));
		stage.setScene(new Scene(loader));
		stage.setTitle("Controller Label");
		stage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}

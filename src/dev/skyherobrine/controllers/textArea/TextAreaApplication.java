package dev.skyherobrine.controllers.textArea;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TextAreaApplication extends Application implements Initializable {

	@FXML
	private Label title;
	
	@FXML
	private TextArea textArea;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		//Thêm sự kiện khi người dùng di chuột ra ngoài thành phần TextArea thì nó tiến hành lấy nội dung của
		//TextArea và gán lên trên title (Label)
		textArea.setOnMouseExited(event -> {
			title.setText(textArea.getText());
		});
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = FXMLLoader.load(TextAreaApplication.class.getResource("text-area.fxml"));
		stage.setScene(new Scene(pane));
		stage.setTitle("Controller TextArea");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

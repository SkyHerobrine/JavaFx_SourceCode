package dev.skyherobrine.controllers.menu;

import java.net.URL;
import java.util.ResourceBundle;

import javax.net.ssl.ExtendedSSLSession;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MenuApplication extends Application implements Initializable {

	@FXML
	private MenuItem menuFileNew;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		menuFileNew.setOnAction(e -> {
			System.out.println("Bạn đã chọn File -> New");
		});
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
		Parent parent = loader.load();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Menu Application");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

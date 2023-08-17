package dev.skyherobrine.advanced.cssStyle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CSSStyleApplication extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent parent = FXMLLoader.load(CSSStyleApplication.class.getResource("css-style.fxml"));
		Scene scene = new Scene(parent);
		scene.getStylesheets().add(getClass().getResource("stage.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("CSS Style Application");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

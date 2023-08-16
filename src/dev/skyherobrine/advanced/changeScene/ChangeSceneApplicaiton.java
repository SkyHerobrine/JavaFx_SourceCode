package dev.skyherobrine.advanced.changeScene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChangeSceneApplicaiton extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent parent = FXMLLoader.load(ChangeSceneApplicaiton.class.getResource("scene_1.fxml"));
		stage.setScene(new Scene(parent));
		stage.setTitle("Advanced Change Scene");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

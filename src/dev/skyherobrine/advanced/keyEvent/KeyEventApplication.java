package dev.skyherobrine.advanced.keyEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class KeyEventApplication extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("key-event.fxml"));
		Parent root = loader.load();
		KeyEventController controller = new KeyEventController();
		Scene scene = new Scene(root);
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				// TODO Auto-generated method stub
				switch (event.getCode().toString()){
				case "W": {
					controller.up();
					break;
				}
				case "A": {
					controller.left();
					break;
				}
				case "D": {
					controller.right();
					break;
				}
				case "S": {
					controller.down();
					break;
				}
			}
		}});

		stage.setScene(scene);
		stage.setTitle("KeyEvent Application");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

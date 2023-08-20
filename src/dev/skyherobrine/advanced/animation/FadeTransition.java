package dev.skyherobrine.advanced.animation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Animation này chuyên dùng để xử lý vấn đề animation mờ - đậm, đậm - mờ. Hay
 * nói cách khác là chuyên xử lý ảnh động Opacity
 */
public class FadeTransition extends Application implements Initializable {

	@FXML
	private Rectangle rectangle;
	private javafx.animation.FadeTransition fade;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		fade = new javafx.animation.FadeTransition();
		fade.setNode(rectangle);
		fade.setDuration(Duration.millis(3000));
		fade.setAutoReverse(true);
		fade.setCycleCount(Animation.INDEFINITE);
		fade.play();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("fade.fxml"));
		Parent parent = loader.load();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Fade Transition Application");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

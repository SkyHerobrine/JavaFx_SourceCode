package dev.skyherobrine.advanced.animation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Dùng để mô tả thành phần sẽ di chuyển theo đường đi (có thể là hình khối, đường thẳng,...)
 */
public class PathTransition extends Application implements Initializable {

	@FXML
	private Rectangle rectangle;
	private javafx.animation.PathTransition path;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		path = new javafx.animation.PathTransition();
		path.setNode(rectangle);
		path.setDuration(Duration.seconds(3));
		path.setAutoReverse(false);
		path.setInterpolator(Interpolator.LINEAR);
		path.setCycleCount(Animation.INDEFINITE);
		path.setPath(new Circle(100));
		path.play();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("path.fxml"));
		Parent parent = loader.load();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Path Transition Application");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Ảnh động này chuyên dùng để xử lý, làm cho ảnh động lớn lên - thu nhỏ, thu
 * nhỏ - lớn lên. Loại animation này không làm thay đổi vị trí để của component
 * nhưng nó làm thay đổi độ rộng/cao của component vì loại này chuyên dùng để
 * phóng to/nhỏ component
 */
public class ScaleTransition extends Application implements Initializable {

	@FXML
	private Rectangle rectangle;
	private javafx.animation.ScaleTransition scaleTransition;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		scaleTransition = new javafx.animation.ScaleTransition();
		scaleTransition.setDuration(Duration.millis(2000));
		scaleTransition.setNode(rectangle);
		scaleTransition.setToX(3);
		scaleTransition.setToY(3);
		scaleTransition.setAutoReverse(true);
		scaleTransition.setCycleCount(Animation.INDEFINITE);

		scaleTransition.play();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(ScaleTransition.class.getResource("scale.fxml"));
		Parent parent = loader.load();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Scale Transition");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

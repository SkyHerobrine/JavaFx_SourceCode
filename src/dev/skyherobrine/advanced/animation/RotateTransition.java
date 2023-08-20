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
 * Animation này chuyên dùng để xử lý vấn đề ảnh động khi xoay ngược lại
 * components, loại animation này không làm dịch chuyển vị trí của component
 * nhưng nó chỉ làm thay đổi góc độ của components mà thôi
 */
public class RotateTransition extends Application implements Initializable {

	@FXML
	private Rectangle rectangle;
	private javafx.animation.RotateTransition rotate;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		rotate = new javafx.animation.RotateTransition();
		rotate.setNode(rectangle);
		rotate.setDuration(Duration.millis(2000));
		rotate.setAutoReverse(true);
		rotate.setCycleCount(Animation.INDEFINITE);
		rotate.setToAngle(360);
		rotate.play();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("rotate.fxml"));
		Parent p = loader.load();
		Scene scene = new Scene(p);
		stage.setScene(scene);
		stage.setTitle("Rotate Transition Application");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

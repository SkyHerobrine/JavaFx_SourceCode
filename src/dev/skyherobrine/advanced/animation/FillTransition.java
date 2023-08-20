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
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Animation này chuyên dùng để xử lý vấn đề biến đổi màu sắc, được hiểu rằng nó
 * sẽ thực hiện ảnh động chuyển từ màu sắc này đến màu sắc khác
 */
public class FillTransition extends Application implements Initializable {

	@FXML
	private Rectangle rectangle;
	private javafx.animation.FillTransition fill;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		fill = new javafx.animation.FillTransition(Duration.millis(3000), rectangle);
		fill.setAutoReverse(true);
		fill.setCycleCount(Animation.INDEFINITE);
		fill.setFromValue(Color.RED);
		fill.setToValue(Color.BLUE);
		fill.play();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("fill.fxml"));
		Parent parent = loader.load();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Fill Transition Application");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

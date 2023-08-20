package dev.skyherobrine.advanced.animation;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.CountDownLatch;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Animation này được coi là animation chuyên dùng phổ biến nhất, animation
 * chuyên dùng để ảnh động dịch chuyển tới một vị trí nào đó.
 */
public class TranslateTransition extends Application implements Initializable{

	@FXML
	private Rectangle rectangle;
	private javafx.animation.TranslateTransition transition;
	private int count = 0;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		rectangle.setX(0);
		rectangle.setY(0);
		rectangle.setFill(Color.RED);
		rectangle.setStroke(Color.YELLOW);

		transition = new javafx.animation.TranslateTransition();
		transition.setNode(rectangle); // Đặt Node sẽ được thực hiện animation
		transition.setDuration(Duration.seconds(3)); // Đặt ảnh động hoàn thành trong vòng 3s
		transition.setToY(-100); // Đặt ảnh động di chuyển tới vị trí Y: Toạ độ Y của nó - 100
		transition.setToX(-200); // Đặt ảnh động di chuyển tới vị trị X: Toạ độ X của nó - 200
		transition.setAutoReverse(true); // Đặt ảnh động di chuyển ngược lại vị trí xuất phát của nó
		transition.setCycleCount(javafx.animation.TranslateTransition.INDEFINITE); // Đặt ảnh động di chuyển vĩnh viễn
																					// vô số lần
		transition.play(); // Bắt đầu ảnh động chạy
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent p = (Parent) FXMLLoader.load(TranslateTransition.class.getResource("translate.fxml"));
		Scene scene = new Scene(p);

		stage.setScene(scene);
		stage.setTitle("Translate Animation");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

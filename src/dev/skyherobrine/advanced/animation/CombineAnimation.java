package dev.skyherobrine.advanced.animation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
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
 * Chỉ là dùng để sử dụng đa các animation cho một component. Sử dụng đối tượng
 * ParallelTransition
 */
public class CombineAnimation extends Application implements Initializable {

	@FXML
	private Rectangle rectangle;
	private TranslateTransition translate;
	private ScaleTransition scale;
	private RotateTransition rotate;
	private ParallelTransition parallel;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		translate = new TranslateTransition();
		translate.setDuration(Duration.millis(3000));
		translate.setToX(-200);
		translate.setToY(-100);
		
		scale = new ScaleTransition();
		scale.setDuration(Duration.millis(1500));
		scale.setToX(2);
		scale.setToY(2);
		scale.setToZ(2);
		
		rotate = new RotateTransition();
		rotate.setDuration(Duration.millis(2500));
		rotate.setToAngle(360);
		
		parallel = new ParallelTransition(rectangle, translate, rotate, scale);
		parallel.setAutoReverse(true);
		parallel.setCycleCount(Animation.INDEFINITE);
		parallel.play();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("combine.fxml"));
		Parent parent = loader.load();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Combine Animation Application");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

package dev.skyherobrine.controllers.mediaView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Khi làm với media thì thêm modules trong VM argument: --add-modules javafx.controls,javafx.media
 */
public class MediaViewApplication extends Application implements Initializable {

	@FXML
	private MediaView mediaView;
	@FXML
	private Button btnPlay, btnPause, btnReset;
	
	private File file;
	private Media media;
	private MediaPlayer mediaPlayer;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		file = new File("GravityFalls.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);	//Từ phương thức này mới hiển thị video trên App
	}
	
	public void play(ActionEvent event) {
		mediaPlayer.play();
	}
	
	public void pause(ActionEvent event) {
		mediaPlayer.pause();
	}
	
	public void reset(ActionEvent event) {
		
		//Tránh tình trạng khi người dùng click vào reset mà trước đó chưa nhấn play thì nó sẽ đơ video nhưng audio thì chạy
		if(mediaPlayer.getStatus() != MediaPlayer.Status.READY)
			mediaPlayer.seek(Duration.seconds(0.0));
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = FXMLLoader.load(MediaViewApplication.class.getResource("media-view.fxml"));
		stage.setScene(new Scene(pane));
		stage.setTitle("Controller WebView");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

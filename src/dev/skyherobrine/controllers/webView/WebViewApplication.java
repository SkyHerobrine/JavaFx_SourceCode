package dev.skyherobrine.controllers.webView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * Chạy ứng dụng WebView
 * Trước khi chạy hãy thêm đoạn này vào VM Run: --add-modules javafx.web
 */
public class WebViewApplication extends Application implements Initializable {

	@FXML
	private TextField urlText;
	@FXML
	private Button btnLoad, btnRefresh;
	@FXML
	private WebView webView;
	
	private WebEngine webEngine;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		webEngine = webView.getEngine();
	}

	/**
	 * Dùng để chạy website thông qua link mình nhập text field
	 * @param event
	 */
	public void loadWebsite(ActionEvent event) {
		webEngine.load("http://" + urlText.getText());
	}
	
	/**
	 * Dùng để reload lại website
	 * @param event
	 */
	public void refreshWebsite(ActionEvent event) {
		webEngine.reload();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = FXMLLoader.load(WebViewApplication.class.getResource("web-view.fxml"));
		stage.setScene(new Scene(pane));
		stage.setTitle("Controller Web-View");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

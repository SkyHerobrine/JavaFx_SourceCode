package dev.skyherobrine.controllers.listView;

import java.net.URL;
import java.util.ResourceBundle;

import dev.skyherobrine.controllers.button.ButtonApplication;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ListViewApplication extends Application implements Initializable {

	@FXML
	private Label title;
	@FXML
	private ListView<String> listView;
	
	private String listNames[] = {"John", "Lee", "Josh", "David", "Krissi"};
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		listView.getItems().addAll(listNames);
		
		/*
		 * Thêm sự kiện khi người dùng click vào một trong những items của ListView sẽ hiển thị trên Title
		 */
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				title.setText(listView.getSelectionModel().getSelectedItem());
			}
		});
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane loader = FXMLLoader.load(ListViewApplication.class.getResource("list-view.fxml"));
		stage.setScene(new Scene(loader));
		stage.setTitle("Controller List-View");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

package dev.skyherobrine.controllers.treeView;

import java.net.URL;
import java.util.ResourceBundle;

import dev.skyherobrine.controllers.listView.ListViewApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TreeViewApplication extends Application implements Initializable {

	@FXML
	private Label title;
	@FXML
	private TreeView<String> treeView;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		TreeItem<String> root = new TreeItem<String>("Main");	//Dòng lệnh này để tạo một node nhưng mục đích là để tạo node root
		
		TreeItem<String> rootItem1 = new TreeItem<String>("C: Windows 10");
		TreeItem<String> rootItem2 = new TreeItem<String>("D: Data");
		TreeItem<String> rootItem3 = new TreeItem<String>("E: Softwave");
		
		TreeItem<String> CItem1 = new TreeItem<String>("Program Files");
		TreeItem<String> CItem2 = new TreeItem<String>("Program Files (x86)");
		TreeItem<String> CItem3 = new TreeItem<String>("Windows");
		TreeItem<String> CItem4 = new TreeItem<String>("Users");
		
		TreeItem<String> DItem1 = new TreeItem<String>("Documents Company");
		TreeItem<String> DItem2 = new TreeItem<String>("File .iso");
		
		TreeItem<String> EItem1 = new TreeItem<String>("Games Online");
		TreeItem<String> EItem2 = new TreeItem<String>("Game Offline");
		
		TreeItem<String> GOnlItem1 = new TreeItem<String>("War Thunder");
		TreeItem<String> GOnlItem2 = new TreeItem<String>("Legends Of League");
		TreeItem<String> GOnlItem3 = new TreeItem<String>("Fifa Online 4");
		
		TreeItem<String> GOffItem1 = new TreeItem<String>("Plant and Zombies 1");
		TreeItem<String> GOffItem2 = new TreeItem<String>("Chicken Invaders 4");
		
		EItem1.getChildren().addAll(GOnlItem1, GOnlItem2, GOnlItem3);
		EItem2.getChildren().addAll(GOffItem1, GOffItem2);
		
		rootItem1.getChildren().addAll(CItem1, CItem2, CItem3, CItem4);
		rootItem2.getChildren().addAll(DItem1, DItem2);
		rootItem3.getChildren().addAll(EItem1, EItem2);
		
		root.getChildren().addAll(rootItem1, rootItem2, rootItem3);
		
		treeView.setRoot(root);
		
		/**
		 * Add sự kiện khi người dùng click vào các node lá (leaf node) sẽ hiển thị nội dung trên title
		 * (Add bằng code hoặc có thể add thông qua UI được hiểu là dùng dạng ánh xạ)
		 */
		treeView.setOnMouseClicked(event -> {
			TreeItem<String> value = treeView.getSelectionModel().getSelectedItem();	
			if(value != null)
				title.setText(value.getValue());
		});
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane loader = FXMLLoader.load(TreeViewApplication.class.getResource("tree-view.fxml"));
		stage.setScene(new Scene(loader));
		stage.setTitle("Controller Tree-View");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}

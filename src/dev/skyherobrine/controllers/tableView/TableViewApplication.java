package dev.skyherobrine.controllers.tableView;

import java.net.URL;
import java.util.ResourceBundle;

import dev.skyherobrine.controllers.treeView.TreeViewApplication;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TableViewApplication extends Application implements Initializable {

	@FXML
	private Label title;
	@FXML
	private TableView<Person> tableView;
	
	@FXML
	private TableColumn<Person, Integer> idColumn;
	@FXML
	private TableColumn<Person, String> nameColumn;
	@FXML
	private TableColumn<Person, Integer> ageColumn;
	@FXML
	private TableColumn<Person, String> locationColumn;
	
	private ObservableList<Person> listRowDatas;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		listRowDatas = FXCollections.observableArrayList(
				new Person(1, "Nguyễn Văn A", 23, "Hồ Chí Minh"),
				new Person(2, "Nguyễn Văn B", 20, "Hà Nội")
		);
		
		idColumn.setCellValueFactory(new PropertyValueFactory<Person, Integer>("id"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
		ageColumn.setCellValueFactory(new PropertyValueFactory<Person, Integer>("age"));
		locationColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("noiSong"));
		
		tableView.setItems(listRowDatas);
		tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		/**
		 * Sử lý sự kiện khi người dùng click vào dòng dữ liệu của table sẽ hiển thị trên title
		 */
		tableView.setOnMouseClicked(event -> {
			title.setText(tableView.getSelectionModel().getSelectedItem().toString());
		});
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane loader = FXMLLoader.load(TableViewApplication.class.getResource("table-view.fxml"));
		stage.setScene(new Scene(loader));
		stage.setTitle("Controller Table-View");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

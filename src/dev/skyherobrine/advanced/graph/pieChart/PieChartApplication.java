package dev.skyherobrine.advanced.graph.pieChart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PieChartApplication extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent parent = new FXMLLoader(getClass().getResource("pie-chart.fxml")).load();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("PieChart Application");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

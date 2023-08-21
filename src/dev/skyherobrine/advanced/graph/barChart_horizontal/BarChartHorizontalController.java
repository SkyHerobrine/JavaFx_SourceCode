package dev.skyherobrine.advanced.graph.barChart_horizontal;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableObjectValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class BarChartHorizontalController implements Initializable {

	@FXML
	private BarChart<String, Number> barChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
		series1.setName("CPU");
		series1.getData().add(new XYChart.Data(500, "USA"));
		series1.getData().add(new XYChart.Data(800, "Frane"));
		series1.getData().add(new XYChart.Data(450, "Japan"));
		
		XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
		series2.setName("RAM");
		series2.getData().add(new XYChart.Data(350, "USA"));
		series2.getData().add(new XYChart.Data(400, "Frane"));
		series2.getData().add(new XYChart.Data(3300, "Japan"));
		
		XYChart.Series<String, Number> series3 = new XYChart.Series<String, Number>();
		series3.setName("GPU");
		series3.getData().add(new XYChart.Data(800, "USA"));
		series3.getData().add(new XYChart.Data(425, "Frane"));
		series3.getData().add(new XYChart.Data(750, "Japan"));
		
		barChart.getData().addAll(series1, series2, series3);
	}

}

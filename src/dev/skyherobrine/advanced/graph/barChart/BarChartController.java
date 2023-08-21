package dev.skyherobrine.advanced.graph.barChart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableObjectValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class BarChartController implements Initializable {

	@FXML
	private BarChart<String, Number> barChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
		series1.setName("CPU");
		series1.getData().add(new XYChart.Data("USA", 500));
		series1.getData().add(new XYChart.Data("Frane", 800));
		series1.getData().add(new XYChart.Data("Japan", 450));
		
		XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
		series2.setName("RAM");
		series2.getData().add(new XYChart.Data("USA", 350));
		series2.getData().add(new XYChart.Data("Frane", 400));
		series2.getData().add(new XYChart.Data("Japan", 3300));
		
		XYChart.Series<String, Number> series3 = new XYChart.Series<String, Number>();
		series3.setName("GPU");
		series3.getData().add(new XYChart.Data("USA", 800));
		series3.getData().add(new XYChart.Data("Frane", 425));
		series3.getData().add(new XYChart.Data("Japan", 750));
		
		barChart.getData().addAll(series1, series2, series3);
	}

}

package dev.skyherobrine.advanced.graph.stackedBarChart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;

public class StackBarChartController implements Initializable {

	@FXML
	private StackedBarChart<String, Number> stackedBarChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("CPU");
		series1.getData().add(new XYChart.Data("Tháng 1", 200));
		series1.getData().add(new XYChart.Data("Tháng 4", 800));
		series1.getData().add(new XYChart.Data("Tháng 8", 1500));
		series1.getData().add(new XYChart.Data("Tháng 12", 2000));
		
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("Ram");
		series2.getData().add(new XYChart.Data("Tháng 1", 800));
		series2.getData().add(new XYChart.Data("Tháng 4", 1700));
		series2.getData().add(new XYChart.Data("Tháng 8", 5400));
		series2.getData().add(new XYChart.Data("Tháng 12", 10000));
		
		XYChart.Series series3 = new XYChart.Series();
		series3.setName("GPU");
		series3.getData().add(new XYChart.Data("Tháng 1", 500));
		series3.getData().add(new XYChart.Data("Tháng 4", 800));
		series3.getData().add(new XYChart.Data("Tháng 8", 400));
		series3.getData().add(new XYChart.Data("Tháng 12", 550));
		
		stackedBarChart.getData().addAll(series1, series2, series3);
	}

}

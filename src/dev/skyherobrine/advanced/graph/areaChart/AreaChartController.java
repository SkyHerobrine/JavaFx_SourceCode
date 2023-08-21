package dev.skyherobrine.advanced.graph.areaChart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;

public class AreaChartController implements Initializable {

	@FXML
	private AreaChart<String, Number> areaChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("CPU");
		series1.getData().add(new XYChart.Data("USA", 200));
		series1.getData().add(new XYChart.Data("Japan", 500));
		series1.getData().add(new XYChart.Data("France", 425));

		XYChart.Series series2 = new XYChart.Series();
		series2.getData().add(new XYChart.Data("USA", 150));
		series2.getData().add(new XYChart.Data("Japan", 320));
		series2.getData().add(new XYChart.Data("France", 405));
		
		XYChart.Series series3 = new XYChart.Series();
		series3.getData().add(new XYChart.Data("USA", 700));
		series3.getData().add(new XYChart.Data("Japan", 820));
		series3.getData().add(new XYChart.Data("France", 1000));
		
		areaChart.getData().addAll(series1, series2, series3);
	}

}

package dev.skyherobrine.advanced.graph.pieChart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class PieChartController implements Initializable {

	@FXML
	private PieChart pieChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		PieChart.Data data = new PieChart.Data("Python", 5000);
		PieChart.Data data1 = new PieChart.Data("Java", 4800);
		PieChart.Data data2 = new PieChart.Data("C#", 2500);
		PieChart.Data data3 = new PieChart.Data("C++", 200);
		PieChart.Data data4 = new PieChart.Data("Ruby", 2500);
	
		pieChart.getData().addAll(data, data1, data2, data3, data4);
	}

}

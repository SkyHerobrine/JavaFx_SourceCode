package dev.skyherobrine.advanced.graph.lineChart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class LineChartController implements Initializable {

	@FXML
	private LineChart<String, Number> lineChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		XYChart.Series seriesWin7 = new XYChart.Series();
		seriesWin7.setName("Windows 7");
		seriesWin7.getData().add(new XYChart.Data("Tháng 1", 3000));
		seriesWin7.getData().add(new XYChart.Data("Tháng 2", 7000));
		seriesWin7.getData().add(new XYChart.Data("Tháng 3", 25000));
		seriesWin7.getData().add(new XYChart.Data("Tháng 4", 35000));
		seriesWin7.getData().add(new XYChart.Data("Tháng 5", 43520));
		seriesWin7.getData().add(new XYChart.Data("Tháng 6", 60000));
		seriesWin7.getData().add(new XYChart.Data("Tháng 7", 68000));
		seriesWin7.getData().add(new XYChart.Data("Tháng 8", 80000));
		seriesWin7.getData().add(new XYChart.Data("Tháng 9", 92500));
		seriesWin7.getData().add(new XYChart.Data("Tháng 10", 92000));
		seriesWin7.getData().add(new XYChart.Data("Tháng 11", 91800));
		seriesWin7.getData().add(new XYChart.Data("Tháng 12", 91000));
		
		XYChart.Series seriesWin10 = new XYChart.Series();
		seriesWin10.setName("Windows 10");
		seriesWin10.getData().add(new XYChart.Data("Tháng 1", 2500));
		seriesWin10.getData().add(new XYChart.Data("Tháng 2", 4000));
		seriesWin10.getData().add(new XYChart.Data("Tháng 3", 8000));
		seriesWin10.getData().add(new XYChart.Data("Tháng 4", 12000));
		seriesWin10.getData().add(new XYChart.Data("Tháng 5", 35000));
		seriesWin10.getData().add(new XYChart.Data("Tháng 6", 60000));
		seriesWin10.getData().add(new XYChart.Data("Tháng 7", 86000));
		seriesWin10.getData().add(new XYChart.Data("Tháng 8", 125000));
		seriesWin10.getData().add(new XYChart.Data("Tháng 9", 140000));
		seriesWin10.getData().add(new XYChart.Data("Tháng 10", 152500));
		seriesWin10.getData().add(new XYChart.Data("Tháng 11", 160000));
		seriesWin10.getData().add(new XYChart.Data("Tháng 12", 155000));
		
		lineChart.getData().addAll(seriesWin7, seriesWin10);
	}
}

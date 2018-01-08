package graph;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class Graph_view extends Frame implements ActionListener,WindowListener{

	JPanel panel;
	CardLayout layout;

    
private static final long serialVersionUID = 1L;
	private Button button1 = new Button("Linechart");
	private Button button2 = new Button("Barchart");
	
	
	public Graph_view() {
		addWindowListener(this);
		setTitle("Graph");
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
				
		
	    

	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1){
			
			//グラフがある場合、グラフを削除してから描写したいremove(cpanel);
			removeAll();
			add(button1);
			add(button2);
			DefaultCategoryDataset data = new DefaultCategoryDataset();
						
			data.addValue(300, "USA", "2005");
			data.addValue(500, "USA", "2006");
			data.addValue(120, "USA", "2007");
			
			data.addValue(200, "China", "2005");
			data.addValue(400, "China", "2006");
			data.addValue(320, "China", "2007");
			
			JFreeChart chart = 
				      ChartFactory.createLineChart("Import Volume",
			                               "Year",
			                               "Ton",
			                               data,
			                               PlotOrientation.VERTICAL,
				                           true,
				                           false,
				                           false);
				    ChartPanel cpanel = new ChartPanel(chart);
				    remove(cpanel);
				    add(cpanel);
				    
		}
		if(e.getSource() == button2){
			
			//グラフがある場合、グラフを削除してから描写したい
			removeAll();
			add(button1);
			add(button2);
			
				DefaultCategoryDataset data = new DefaultCategoryDataset();
				
				data.addValue(300, "USA", "2005");
				data.addValue(500, "USA", "2006");
				data.addValue(120, "USA", "2007");
				
				data.addValue(200, "China", "2005");
				data.addValue(400, "China", "2006");
				data.addValue(320, "China", "2007");
				
				
				JFreeChart chart = 
					      ChartFactory.createBarChart("Import Volume",
				                               "Year",
				                               "Ton",
				                               data,
				                               PlotOrientation.VERTICAL,
					                           true,
					                           false,
					                           false);
					    ChartPanel cpanel = new ChartPanel(chart);
					    remove(cpanel);
					    add(cpanel);
					    
			}
				
		}
	

}

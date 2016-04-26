package drawing.view;

import javax.swing.JPanel;
import java.awt.* ;
import java.awt.geom.*;
import java.util.ArrayList;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Rectangle> squareList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public ShapePanel()
	{
		triangleList = new ArrayList<Polygon>();
		polygonList = new ArrayList<Polygon>();
		rectangleList = new ArrayList<Rectangle>();
		squareList = new ArrayList<Rectangle>();
		circleList = new ArrayList<Ellipse2D>();
		ellipseList = new ArrayList<Ellipse2D>(); 
	}
	
	public void addRectangle()
	{
		
	}
	
	public void addSquare()
	{
		
	}
	
	public void addEllipse()
	{
		
	}
	
	public void addCircle()
	{
		int xPoint = (int)(Math.random()* 1000);
		int yPoint = (int)(Math.random()* 1000);
		int diameter = (int)(Math.random()* 1000);
	}
	
	public void addTriangle()
	{
		
		int [] xPoints = new int[3];
		int [] yPoints = new int[3];
		xPoints[0]= (int)(Math.random()*250);
	    
		xPoints =new int []{(int)(Math.random()* 250), (int)(Math.random) 
		
	}
	
	public void addPolygon()
	{
		
	}
	
	
}

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
		
	}
	
	public void addTriangle()
	{
		
	}
	
	public void addPolygon()
	{
		
	}
	
	
}

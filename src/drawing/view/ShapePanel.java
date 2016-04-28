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
		int xPosition = (int)(Math.random()*1500);
		int yPosition = (int)(Math.random()*1000);
		int width = (int)(Math.random()*2000);
		int height = width;

		Rectangle2D currentSquare = new  Rectangle2D.Double(xPosition,yPosition,width,height);
	}
	
	public void addSquare()
	{
		int xPosition = (int)(Math.random()*1500);
		int yPosition = (int)(Math.random()*1000);
		int width = (int)(Math.random()*2000);
		int height = width;

		Rectangle2D currentSquare = new  Rectangle2D.Double(xPosition,yPosition,width,height);
	}
	
	public void addEllipse()
	{
		int xPosition = (int)(Math.random()*1500);
		int yPosition = (int)(Math.random()*1000);
		int width = (int)(Math.random()*2000);
		int height = (int)(Math.random()* 1000);
		
		Ellipse2D currentEllipse = new Ellipse2D.Double(xPosition,yPosition,width,height);
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
	    
		xPoints = new int []{(int)(Math.random()* 250), (int)(Math.random()*250), (int)(Math.random()*250)}; 
		yPoints = new int []{(int)(Math.random()* 250), (int)(Math.random()*250), (int)(Math.random()*250)};
		
		Polygon triangle = new Polygon(xPoints, yPoints,3);
		
		triangleList.add(triangle);
	}
	
	public void addPolygon()
	{
		int numberOfSides= (int)(Math.random()*10) + 3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for (int sides=0; sides<numberOfSides;sides++ )
		{
			xPoints[sides]= (int)(Math.random()*300);
			yPoints[sides]= (int)(Math.random()*300);
		}
		
		Polygon myPolygon = new Polygon(xPoints,yPoints,numberOfSides);
		polygonList.add(myPolygon);
		
	}
	
	protected void paintComponet(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		drawShapes(mainGraphics,circleList);
		drawShapes(mainGraphics,ellipseList);
		drawShapes(mainGraphics,squareList);
		drawShapes(mainGraphics,rectangleList);
		drawShapes(mainGraphics,triangleList);
		drawShapes(mainGraphics,polygonList);
	}
	
	private void drawShapes(Graphics2D mainGraphics, ArrayList shapeList)
	{
		for(Object currentShape:shapeList)
		{
			int red = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int penSize = (int)(Math.random()*10)+3;
			
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.setStroke(new BasicStroke(penSize));
			if(currentShape instanceof Polygon)
			{
			mainGraphics.draw((Shape)currentShape);
		   }
			else
			{
				mainGraphics.fill((Shape)currentShape);
			}
		}
	}
	
}

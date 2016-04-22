package drawing.view;

import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

import drawing.controller.DrawingController;

public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	private SpringLayout baseLayout;
	private ShapePanel shapePanel;
	private JButton drawRectangleButton;
	private ArrayList<Rectangle> rectangleList;
	
	
	 
	   
	  private void setupListeners()
	  {
		  drawRectangleButton.addActionListener(new ActionListener()
		  {
			  public void actionPerformed(ActionEvent click)
			  {
				  int xPosition = (int)(Math.random()* 600);
				  int yPosition = (int)(Math.random()* 600);
				  int width = (int)(Math.random()*50);
				  int height = (int)(Math.random()*50);
				  
				  rectangleList.add(new Rectangle(xPosition,yPosition,width,height));
				  repaint();
			  }
		  });
		  
	  }
	 
		   
	
	protected void paintCompnent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		mainGraphics.setColor(Color.GREEN);
		mainGraphics.setStroke(new BasicStroke(15));
		mainGraphics.draw(new Rectangle(90,10,20,40));
		
		for(Rectangle current:rectangleList)
		{
			int randomStroke= (int)(Math.random()*7);
			int red = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			int green= (int)(Math.random()*256);
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			
			mainGraphics.fill(current);
			
		}
		
	}
	
	
}

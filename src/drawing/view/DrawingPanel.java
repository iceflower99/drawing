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
	private JButton addRectangleButton;
	private JButton addSquareButton;
	private JButton addEllipseButton;
	private JButton addCircleButton;
	private JButton addTriangleButton;
	private JButton addPolygonButton;
	private JButton addClearButton;
	private ArrayList<Rectangle> rectangleList;
	
	public DrawingPanel(DrawingController baseController)
	{
		baseLayout = new SpringLayout();
		shapePanel = new ShapePanel();
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 20, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, 200, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -20, SpringLayout.EAST, this);
		addSquareButton = new JButton();
		addEllipseButton=new JButton();
		baseLayout.putConstraint(SpringLayout.WEST, addSquareButton, 6, SpringLayout.EAST, addEllipseButton);
		addCircleButton=new JButton();
		baseLayout.putConstraint(SpringLayout.WEST, addCircleButton, 6, SpringLayout.EAST, addSquareButton);
		addTriangleButton=new JButton();
		baseLayout.putConstraint(SpringLayout.EAST, addTriangleButton, -10, SpringLayout.EAST, this);
		addPolygonButton=new JButton();
		addClearButton=new JButton();
		rectangleList=new ArrayList<Rectangle>();
		setupPanel();
		setupListeners();
	}
	 
	   
	  private void setupListeners()
	  {
		  addRectangleButton.addActionListener(new ActionListener()
		  {
			  public 
			  void actionPerformed(ActionEvent click)
			  {
				  shapePanel.addRectangle();
				  repaint();
			  }
		  });
		  addSquareButton.addActionListener(new ActionListener()
		  {
			  public 
			  void actionPerformed(ActionEvent click)
			  {
				  shapePanel.addSquare();
				  repaint();
			  }
		  });
		  
		  addEllipseButton.addActionListener(new ActionListener()
		  {
			  public 
			  void actionPerformed(ActionEvent click)
			  {
				  shapePanel.addEllipse();
				  repaint();
			  }
		  });
		  
		  addCircleButton.addActionListener(new ActionListener()
		  {
			  public 
			  void actionPerformed(ActionEvent click)
			  {
				  shapePanel.addCircle();
				  repaint();
			  }
		  });
		  addPolygonButton.addActionListener(new ActionListener()
		  {
			  public 
			  void actionPerformed(ActionEvent click)
			  {
				  shapePanel.addPolygon();
				  repaint();
			  }
		  });
		  addCircleButton.addActionListener(new ActionListener()
		  {
			  public 
			  void actionPerformed(ActionEvent click)
			  {
				  shapePanel.addCircle();
				  repaint();
			  }
		  });
		  
	  }
	 
		  private void setupPanel()
		  {
			  this.setLayout(baseLayout);
			  this.setBackground(Color.DARK_GRAY);
			  addRectangleButton=new JButton();
			  baseLayout.putConstraint(SpringLayout.SOUTH, addPolygonButton, -40, SpringLayout.NORTH, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.EAST, addPolygonButton, 0, SpringLayout.EAST, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.SOUTH, addTriangleButton, 0, SpringLayout.SOUTH, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.NORTH, addCircleButton, 0, SpringLayout.NORTH, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.SOUTH, addSquareButton, 0, SpringLayout.SOUTH, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.WEST, addEllipseButton, 29, SpringLayout.EAST, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.SOUTH, addEllipseButton, 0, SpringLayout.SOUTH, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 10, SpringLayout.WEST, this);
			  baseLayout.putConstraint(SpringLayout.SOUTH, addRectangleButton, -10, SpringLayout.SOUTH, this);
			  this.add(addRectangleButton);
			  this.add(addSquareButton);
			  this.add(addEllipseButton);
			  this.add(addCircleButton);
			  this.add(addTriangleButton);
			  this.add(addPolygonButton);
			  this.add(shapePanel);
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

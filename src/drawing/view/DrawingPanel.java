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
	private GraphPanel graphPanel;
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
		graphPanel = new GraphPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, graphPanel, 36, SpringLayout.SOUTH, shapePanel);
		baseLayout.putConstraint(SpringLayout.WEST, graphPanel, 0, SpringLayout.WEST, shapePanel);
		baseLayout.putConstraint(SpringLayout.SOUTH, graphPanel, 257, SpringLayout.SOUTH, shapePanel);
		baseLayout.putConstraint(SpringLayout.EAST, graphPanel, -12, SpringLayout.EAST, shapePanel);
		addSquareButton = new JButton();
		addSquareButton.setText("Square");
		addEllipseButton=new JButton();
		baseLayout.putConstraint(SpringLayout.WEST, addSquareButton, 29, SpringLayout.EAST, addEllipseButton);
		addEllipseButton.setText("Ellipse");
		addCircleButton=new JButton();
		baseLayout.putConstraint(SpringLayout.WEST, addCircleButton, 0, SpringLayout.WEST, addSquareButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, addCircleButton, -6, SpringLayout.NORTH, addSquareButton);
		addCircleButton.setText("Circle");
		addTriangleButton=new JButton();
		baseLayout.putConstraint(SpringLayout.WEST, addTriangleButton, 0, SpringLayout.WEST, addEllipseButton);
		addTriangleButton.setText("Triangle");
		addPolygonButton=new JButton();
		baseLayout.putConstraint(SpringLayout.NORTH, addTriangleButton, 0, SpringLayout.NORTH, addPolygonButton);
		addPolygonButton.setText("Polygon");
		addClearButton=new JButton();
		rectangleList=new ArrayList<Rectangle>();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	 private void setupLayout() 
	 {
		 baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 20, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 20, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, 200, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -20, SpringLayout.EAST, this);
			
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
			  baseLayout.putConstraint(SpringLayout.WEST, addPolygonButton, 0, SpringLayout.WEST, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.SOUTH, addPolygonButton, -5, SpringLayout.NORTH, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.NORTH, addEllipseButton, 0, SpringLayout.NORTH, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.WEST, addEllipseButton, 6, SpringLayout.EAST, addRectangleButton);
			  addRectangleButton.setText("Rectangle");
			  baseLayout.putConstraint(SpringLayout.SOUTH, addSquareButton, 0, SpringLayout.SOUTH, addRectangleButton);
			  baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 10, SpringLayout.WEST, this);
			  baseLayout.putConstraint(SpringLayout.SOUTH, addRectangleButton, -10, SpringLayout.SOUTH, this);
			  this.add(addRectangleButton);
			  this.add(addSquareButton);
			  this.add(addEllipseButton);
			  this.add(addCircleButton);
			  this.add(addTriangleButton);
			  this.add(addPolygonButton);
			  this.add(shapePanel);
			  this.add(graphPanel);
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

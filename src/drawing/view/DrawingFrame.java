package drawing.view;

import javax.swing.*;
import drawing.controller.DrawingController;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel basePanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController= baseController;
		basePanel=new DrawingPanel(baseController);
 		setUpFrame();
	}
	
	private void setUpFrame()
 	{
 		this.setContentPane(basePanel);
 		this.setSize(400,600);
 		this.setResizable(true);
 		this.setVisible(true); 		
 	}
	
	
	
}

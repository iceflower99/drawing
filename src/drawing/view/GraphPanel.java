package drawing.view;

import java.awt.*;
import javax.swing.JPanel;

public class GraphPanel extends JPanel
{
	
	private int [] graphSource;
	
	public GraphPanel()
	{
		graphSource = new int[]{2,4,213,10,20,12,75};
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.LIGHT_GRAY);
	}
	
	protected void paintComponet(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		for(int index = 0; index <graphSource.length; index++)
		{
			int height = this.getHeight()/graphSource.length;
			int width = graphSource[index];
			int xPosition= 0;
			int yPosition = height * index;
			
			int red = (int)(Math.random()*256);
		}
	}

}

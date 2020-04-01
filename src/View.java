import java.awt.Graphics;

import javax.swing.JPanel;

class Background {
	
	int slideRate;
	
	static int backgroundWidth = 1500;
		
}

	

public class View extends JPanel {

	private Environment environment;  
	
	public View(Environment environment) {
		
		this.environment = environment;
		
		
		
	}
	
	@Override
	public void paintComponent(Graphics graphics) {
		
		for (Visual visual: environment.visuals) {
			graphics.drawImage(visual.image, visual.x, visual.y, null);
		}
		
	}
}





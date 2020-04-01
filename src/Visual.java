import java.awt.Image;

import javax.swing.ImageIcon;

public class Visual {
	
	public int x;
	public int y; 
	String imagePath; 
	public Image image; 
	
	public Visual(int x, int y, String imagePath) {
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
		ImageIcon imageIcon = new ImageIcon(imagePath); 
		image = imageIcon.getImage();
	}
	
	
}

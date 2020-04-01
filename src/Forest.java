import java.awt.EventQueue;

import javax.swing.JFrame;

public class Forest {

	static final int FRAME_WIDTH = 1600;
	static final int FRAME_HEIGHT = (FRAME_WIDTH/16) * 9;
	
	private JFrame frame;

	private View view; 
	
	 Environment environment;  
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forest window = new Forest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Forest() {
		initialize();
	}

	/*
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Visual visual = new Visual (-1000, -1000, "images/theForest.png"); 
		
		environment = new Environment(); 
		environment.addVisual(visual);
		
		visual = new Visual (750, 720, "images/mainCharacter.png"); 
		environment.addVisual(visual);

		 
		view = new View(environment); 
		frame.add(view);
		
	}

}

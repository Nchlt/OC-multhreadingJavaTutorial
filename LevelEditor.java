import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LevelEditor extends JFrame{
	JPanel levelDisplay;
	JPanel leftPanel;
	JPanel rightPanel;
	
	public LevelEditor() {
		super("Editeur de niveau Arkanoid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 600);
		setResizable(false);
		Container cp = getContentPane();
				
		leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(200, 600));
		leftPanel.setBackground(Color.GRAY);
		cp.add(leftPanel, BorderLayout.WEST);
		
		rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(200, 600));
		rightPanel.setBackground(Color.GRAY);
		cp.add(rightPanel, BorderLayout.EAST);
		
		levelDisplay = new JPanel();
		//levelDisplay.setSize(800 ,600);
		levelDisplay.setPreferredSize(new Dimension(800, 600));
		levelDisplay.setBackground(Color.BLACK);
		cp.add(levelDisplay, BorderLayout.CENTER);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		LevelEditor le = new LevelEditor();
	}

}

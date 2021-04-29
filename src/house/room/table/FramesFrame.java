package house.room.table;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FramesFrame extends JFrame 
{
	private static final int HEIGHT = 400;
	private static final int WIDTH = 400;

	public FramesFrame()
	{
		super("Boring Frame");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		FlowLayout fl = new FlowLayout();
		
		JButton b1 = new JButton("One");
		JButton b2 = new JButton("Two");
		JButton b3= new JButton("Three");
		JButton b4 = new JButton("Four");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
}

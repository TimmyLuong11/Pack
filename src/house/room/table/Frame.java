package house.room.table;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame 
{
	public Frame()
	{
		super("My First Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(100,100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		FlowLayout fm = new FlowLayout();
		this.setLayout(fm);
		
		makeButtons();
	}

	private void makeButtons() 
	{
		for(int index = 0; index < 500; ++index)
		{
		JButton button = new JButton("WOW");
		this.add(button);
		
		JButton button1 = new JButton("F MY LIFE");
		this.add(button1);
		}
		
		this.pack();
	}
	
	public static void main(String[] args)
	{
		new Frame();
	}
}

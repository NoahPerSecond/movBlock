package movBlock;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GameScreen extends JPanel implements Runnable{
	int[][] bg = new int[20][20];
	Character c;
	Box b;
	Door d;
	Thread thread;
	
	public GameScreen()
	{
		b = new Box();
		c = new Character();
		d = new Door();
		thread = new Thread(this);
		thread.start();
	}
	
	public void paint(Graphics g)
	{
		this.paintBg(g);
		c.drawChar(g);
		b.drawBox(g);
		d.drawDoor(g);
	}
	
	
	void paintBg(Graphics g)
	{
		
		for(int i = 0; i< 8; i++)
		{
			for(int j =0; j<8; j++)
			{
				g.setColor(Color.gray);
				g.fillRect(i*20+35, j*20+35, 15, 15);
				if(i==0 || j==0 || i ==7 || j== 7)
				{
					g.setColor(Color.black);
					g.fillRect(i*20+35, j*20+35, 15, 15);
				}
			}
		}
	}
	
	public void run()
	{
		while(true)
		{
			c.update();
			b.update();
			repaint();
			try {
				thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

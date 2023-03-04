package movBlock;

import java.awt.Color;
import java.awt.Graphics;

public class Door {
	int x, y;
	public Door()
	{
		this.x = 6;
		this.y = 3;
	}
	
	public void drawDoor(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(this.x*20 +35, this.y*20 + 35 , 15, 15);
	}
}

package movBlock;

import java.awt.Color;
import java.awt.Graphics;

public class Box {
	Character c;
	int x, y;
	public static int GO_UP =1;
	public static int GO_DOWN =2;
	public static int GO_LEFT =3;
	public static int GO_RIGHT =4;
	
	int vector = 0;
	
	public Box()
	{
		c = new Character();
		this.x = 2;
		this.y = 2;
	}
	
	void setVector(int v)
	{
		this.vector = v;
	}
	
	
	
	public void update()
	{
		if(c.x == this.x && c.y == this.y)
		{
			this.setVector(c.getDirect()); 
			
		}
		if(vector == this.GO_DOWN) 
		{
			y++ ;
			
		}
		if(vector == this.GO_UP) 
		{
			y--;
			
		}
		if(vector == this.GO_RIGHT)
		{
			x++;
			
		}
		if(vector == this.GO_LEFT)
		{
			x--;
			
		}
		this.setVector(0);
		
		
	}
	
	
	public void drawBox(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(this.x*20 +35, this.y*20 + 35 , 15, 15);
	}
}

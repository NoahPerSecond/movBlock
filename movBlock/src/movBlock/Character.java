package movBlock;

import java.awt.Color;
import java.awt.Graphics;



public class Character {
	int x, y;
	
	public static int GO_UP =1;
	public static int GO_DOWN =2;
	public static int GO_LEFT =3;
	public static int GO_RIGHT =4;
	
	int vector ;
	long t1 = 0;
	int direct=0;
	
	public Character()
	{
		this.x = 5;
		this.y = 5;
	}
	
	public void setVector(int v)
	{
		this.vector = v;
	}
	
	public int getDirect()
	{
		return direct;
	}
	
	public void update()
	{
		if(this.x < 7 && this.y < 7 )
		{
			if(vector == this.GO_DOWN) 
			{
				y++ ;
				direct = GO_DOWN;
			}
			if(vector == this.GO_UP) 
			{
				y--;
				direct = GO_UP;
			}
			if(vector == this.GO_RIGHT)
			{
				x++;
				direct = GO_RIGHT;
			}
			if(vector == this.GO_LEFT)
			{
				x--;
				direct = GO_LEFT;
			}
			this.setVector(0);
			
		}
		else
		{
			this.setVector(0);
		}
		
		
		
	}
	
	
	
	public void drawChar(Graphics g)
	{
		g.setColor(Color.PINK);
		g.fillRect(this.x*20 +35, this.y*20 + 35 , 15, 15);
	}
}

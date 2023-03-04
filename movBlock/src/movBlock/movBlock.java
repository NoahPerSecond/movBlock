package movBlock;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class movBlock extends JFrame{
	
	GameScreen gs;
	
	public movBlock()
	{
		this.setSize(500, 500);
		gs = new GameScreen();
		this.add(gs);
		this.addKeyListener(new handler());
		
		//Hien man hinh
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movBlock mb = new movBlock();

	}
	
	private class handler implements KeyListener
	{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_W)
			{
				gs.c.setVector(Character.GO_UP);
				
			}
			if(e.getKeyCode() == KeyEvent.VK_S)
			{
				gs.c.setVector(Character.GO_DOWN);
			}
			if(e.getKeyCode() == KeyEvent.VK_D)
			{
				gs.c.setVector(Character.GO_RIGHT);
			}
			if(e.getKeyCode() == KeyEvent.VK_A)
			{
				gs.c.setVector(Character.GO_LEFT);
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}

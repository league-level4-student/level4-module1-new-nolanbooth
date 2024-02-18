package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int height;

	public Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	

	

	public abstract void update();

	public abstract void draw(Graphics g);

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}

class RedPolymorph extends Polymorph {
		public RedPolymorph(int x, int y, int width, int height) {
			super(x, y, width, height);
		}
		

		@Override
		public void update() {
			
			
		}

		@Override
		public void draw(Graphics g) {
			
			g.setColor(Color.red);
			g.fillRect(getX(), getY(), getWidth(), getHeight());
			
		}
	}
class MovingMorph extends Polymorph implements MouseMotionListener {
	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	@Override
	public void update() {
		
		
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
		
	}
}


	


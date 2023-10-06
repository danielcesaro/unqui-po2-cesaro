package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		new Point(0,0);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void moveToPoint(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	public Point sumWithPoint(Point otroPunto) {
		final int newX = this.getX() + otroPunto.getX();
		final int newY = this.getY() + otroPunto.getY();
		return new Point(newX, newY);
	}
}

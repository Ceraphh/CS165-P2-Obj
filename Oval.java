// P2 Assignment
// Author: reecedw
// Date  : Feb 17, 2020
// Class : CS165
// Email : 831066972@cs.colostate.edu

public class Oval extends Primitive {
	private int color, x, y, width, height;
	private boolean isFilled;
	public Oval(int x, int y, int width, int height) {
		this.x = x;
		this.y =y;
		this.width = width;
		this.height = height;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled =isFilled; 
	}
	public void draw(UserInterface ui) {
		ui.drawOval(x, y, width, height, isFilled);
	}
}

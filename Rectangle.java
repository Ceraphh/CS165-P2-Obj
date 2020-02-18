// P2 Assignment
// Author: reecedw
// Date  : Feb 14, 2020
// Class : CS165
// Email : 831066972@cs.colostate.edu

public class Rectangle extends Primitive {
	private int color, x, y, width, height;
	private boolean isFilled;
	

	public Rectangle (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
}
	public void setColor(int color) {
		this.color = color;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	public void draw(UserInterface ui) {
		ui.drawRectangle(x, y, width, height, isFilled);

	}
}
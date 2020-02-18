// P2 Assignment
// Author: reecedw
// Date  : Feb 17, 2020
// Class : CS165
// Email : 831066972@cs.colostate.edu

public class Circle extends Primitive {
	private int color, x, y, radius;
	private boolean isFilled;
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y =y;
		this.radius = radius;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled =isFilled; 
	}
	public void draw(UserInterface ui) {
		ui.drawOval(x, y, (radius*2), (radius*2), isFilled);
	}

}

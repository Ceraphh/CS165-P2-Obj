// P2 Assignment
// Author: reecedw
// Date  : Feb 17, 2020
// Class : CS165
// Email : 831066972@cs.colostate.edu

public class Triangle extends Primitive{
	
	private int color, x0, y0, x1, x2,y1,y2;
	private boolean isFilled;
	public Triangle() {}
	
	public Triangle(int x0, int y0, int x1, int y1, int x2, int y2) {
		this.x0 = x0;
		this.x1 = x1;
		this.x2 = x2;
		this.y0 = y0;
		this.y1=y1;
		this.y2=y2;
	}
	public void setColor(int color) {
		this.color= color;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	public void draw(UserInterface ui) {
		if (this.isFilled)
			ui.fillColor(color);
		else
			ui.lineColor(color);
		
		int[] xPoints = {x0,x1,x2};
		int[] yPoints = {y0,y1,y2};

		ui.drawPolygon(xPoints, yPoints, isFilled);
	}
	
}

// P2 Assignment
// Author: reecedw
// Date  : Feb 14, 2020
// Class : CS165
// Email : 831066972@cs.colostate.edu

public class Square extends  Primitive{
    public static UserInterface ui;

	private int color, x, y, size;
	private boolean isFilled;
	
	public void setColor(int color) {
		this.color = color;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	Square (int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
		

	public void draw(UserInterface ui) {
		//what do i do here?
		//do i use an interface, make a graphic object, etc
		//how do i call the drawRect method, assuming thats what i want. i guess I am over
		//w
		ui.drawRectangle(x, y, (int)Math.sqrt(size), (int)Math.sqrt(size), isFilled);
	}

}

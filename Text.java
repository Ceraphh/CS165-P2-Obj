// P2 Assignment
// Author: reecedw
// Date  : Feb 17, 2020
// Class : CS165
// Email : 831066972@cs.colostate.edu

public class Text extends Primitive{
	private int color, x, y, fontSize;
	private String text,fontName;
	public Text(int x, int y, String text) {
		this.x=x;
		this.y=y;
		this.text=text;
	}
	public void setColor(int color) {
		this.color=color;
	}
	public void setFont(String fontName, int fontSize) {
		this.fontName = fontName;
	}
	public void draw(UserInterface ui) {
		ui.drawText(x, y, text);
	}
}

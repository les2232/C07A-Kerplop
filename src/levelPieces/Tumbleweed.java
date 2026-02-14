package levelPieces;

import gameEngine.Drawable;

public class Tumbleweed implements Drawable{
	
	private char symbol;
	private int location;
	
	public Tumbleweed(int location) {
		this.symbol = '*';
		this.location = location;
		
	}

	@Override
	public void draw() {
		System.out.print(symbol);
	}
	
	public int getLocation() {
		return location;
	}
	
	public void setLocation(int newLocation) {
		this.location = newLocation;
	}

}

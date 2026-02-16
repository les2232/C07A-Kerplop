package levelPieces;

import gameEngine.Drawable;

public class Cactus implements Drawable {
	private int location;
	
	public Cactus(int location) {
		this.location = location;
	}
	
	public int getLocation() {
		return location; 
	}
	
	@Override
	public void draw() {
		System.out.print('C');
	}

}

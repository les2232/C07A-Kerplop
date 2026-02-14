package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import gameEngine.GameEngine;

public class Outlaw extends GamePiece implements Moveable {
	
	private int direction = 1;

	public Outlaw(int location) {
		super('O', "Outlaw", location);
	}
	
	@Override
	public void move (Drawable[] gameBoard, int playerLocation) {
		int prevLocation = getLocation();
		int newLocation = prevLocation + direction;
		
		if (newLocation < 0 == newLocation >= gameBoard.length) {
			direction = direction * -1;
			newLocation = prevLocation + direction;
		}
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

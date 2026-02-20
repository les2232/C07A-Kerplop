package levelPieces;

import gameEngine.Drawable; 

import gameEngine.InteractionResult;

import gameEngine.Moveable;


public class SaloonDoor extends GamePiece implements Moveable {
	public SaloonDoor(int location) {
		super('=', "SaloonDoor", location);
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		
		if (playerLocation == getLocation()) {
			return InteractionResult.ADVANCE;
		}
		return InteractionResult.NONE;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int current = getLocation();
		setLocation(current);
		
		gameBoard[current] = this;
	}

}

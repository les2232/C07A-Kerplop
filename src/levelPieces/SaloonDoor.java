package levelPieces;

import gameEngine.Drawable; 
import gameEngine.InteractionResult;


public class SaloonDoor extends GamePiece 
{
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

}

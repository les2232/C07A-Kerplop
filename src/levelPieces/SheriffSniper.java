package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class SheriffSniper extends GamePiece {
	private static final int RANGE = 3;
	
	public SheriffSniper(int location) {
		super('S', "SheriffSniper", location);
	}

	@Override
	public gameEngine.InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		
		int distance = Math.abs(playerLocation - getLocation());
		
		if (distance <= RANGE) {
			return InteractionResult.KILL;
		}
		
		return InteractionResult.NONE;
	}

	

}

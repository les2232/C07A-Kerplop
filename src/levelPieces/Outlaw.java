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
		
		int current = getLocation();
		int next = current + direction;
		
		if (next < 0 || next >= gameBoard.length || gameBoard[next] != null) {
			direction = direction * -1;
			next = current + direction;
		}
		
		if(gameBoard[next] == null) {
			setLocation(next);
			gameBoard[current] = null;
			gameBoard[next] = this;
		}
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		int distance = Math.abs(playerLocation - getLocation());
		
		if (distance <= 1) {
			return InteractionResult.HIT;
		}
		
		return InteractionResult.NONE;
	}
	

}

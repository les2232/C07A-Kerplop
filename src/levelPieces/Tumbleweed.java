package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Tumbleweed extends GamePiece implements Moveable{;
	
	public Tumbleweed(int location) {
		super('*', "Tumbleweed", location);
		
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int current = getLocation();
		
		int step = (int)(Math.random() * 3) - 1;
		int next = current + step; 
		
		if (next < 0) {
			next = 0;
		}
		
		if (next >= gameBoard.length) { 
			next = gameBoard.length - 1;
		}
		
		if(gameBoard[next] == null) {
			setLocation(next);
			gameBoard[current] = null;
			gameBoard[next] = this;
		}
	}
	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		return InteractionResult.NONE;
	}

}

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class BullStampede extends GamePiece implements Moveable {
	
	public BullStampede(int location) {
		super('B', "BullStampede", location);
	}
	
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
    	int distance = Math.abs(playerLocation - getLocation());
    	
        if (distance == 0) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
	
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int current = getLocation();
		
		if (current == playerLocation) {
			return; 
		}
		
		int next = current;
		
		if (playerLocation > current) {
			next = current + 1;
			setLocation(next);
			
		} else if (playerLocation < current) {
			next = current - 1;
			setLocation(next);
		}
		
		if(gameBoard[next] == null) {
			setLocation(next);
			gameBoard[current] = null;
			gameBoard[next] = this;
		}
		
	}

}

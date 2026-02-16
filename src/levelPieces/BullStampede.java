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
        if (playerLocation == getLocation()) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
	
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int currentLocation = getLocation();
		
		if (currentLocation == playerLocation) {
			return; 
		}
		
		if (playerLocation > currentLocation) {
			setLocation(currentLocation + 1);
			return;
		}
		
		if (playerLocation < currentLocation) {
			setLocation(currentLocation - 1);
		}
		
	}

}

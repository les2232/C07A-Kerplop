package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult; 

public class GoldNugget extends GamePiece(int location) {

    public GoldNugget(int location) {
        super('$', "Gold Nugget", location); 
    }
    
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            gameBoard[getLocation()] = null; 
            return InteractionResult.GET_POINT;
        }
        return InteractionResult.NONE;
    }
}

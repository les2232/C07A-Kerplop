package levelPieces;

import java.util.ArrayList;

import gameEngine.GameEngine;
import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	
	private Drawable[] board;
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
	private int playerStartLoc;
	
	public void createLevel(int levelNum) {
		board = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<>();
		interactingPieces = new ArrayList<>();
		playerStartLoc = GameEngine.BOARD_SIZE/2;
		
		if (levelNum == 1) {
			buildLevel1();
		} else if (levelNum == 2) {
			buildLevel2();
		}
	}

	public ArrayList<Moveable> getMovingPieces() {
		return movingPieces;
	}

	public Drawable[] getBoard() {
		return board;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}

	public int getPlayerStartLoc() {
		return playerStartLoc;
	}
	
	private void buildLevel1() {
		board = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<>(); 
		interactingPieces = new ArrayList<>();
		
		playerStartLoc = 0;

		Tumbleweed tumbleweed = new Tumbleweed(5);
		GoldNugget goldNugget = new GoldNugget(10);
		Outlaw outlaw = new Outlaw(15);
		SaloonDoor saloonDoor = new SaloonDoor(20);

		gameBoard[tumbleweed.getLocation()] = tumbleweed;
		gameBoard[goldNugget.getLocation()] = goldNugget;
		gameBoard[outlaw.getLocation()] = outlaw;
		gameBoard[saloonDoor.getLocation()] = saloonDoor;

		movingPieces.add(tumbleweed);
		interactingPieces.add(goldNugget);
		interactingPieces.add(outlaw);
		interactingPieces.add(saloonDoor);
	}
	
	private void buildLevel2() {
		
	}
}


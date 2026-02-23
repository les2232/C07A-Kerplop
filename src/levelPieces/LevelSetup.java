package levelPieces;

import java.util.ArrayList;

import gameEngine.GameEngine;
import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	
	private Drawable[] gameBoard;
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
	private int playerStartLoc;
	
	public void createLevel(int levelNum) {
		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<>();
		interactingPieces = new ArrayList<>();
		playerStartLoc = GameEngine.BOARD_SIZE/2; // start player in middle of board by default
		
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
		return gameBoard;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}

	public int getPlayerStartLoc() {
		return playerStartLoc;
	}
	
	private void buildLevel1() {
		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
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
		movingPieces.add(outlaw);
		interactingPieces.add(goldNugget);
		interactingPieces.add(outlaw);
		interactingPieces.add(saloonDoor);
	}
	
	private void buildLevel2() {
		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<>();
		interactingPieces = new ArrayList<>();

		playerStartLoc = GameEngine.BOARD_SIZE/2; // start player in middle of board by default

		Tumbleweed tumbleweed1 = new Tumbleweed(3);
		BullStampede bullStampede = new BullStampede(7);

		Cactus cactus1 = new Cactus(11);
		Cactus cactus2 = new Cactus(14);
		Outlaw outlaw = new Outlaw(17);
		SheriffSniper sheriffSniper = new SheriffSniper(19);

		GoldNugget goldNugget1 = new GoldNugget(5);
		GoldNugget goldNugget2 = new GoldNugget(9);

		SaloonDoor saloonDoor = new SaloonDoor(20);

		gameBoard[tumbleweed1.getLocation()] = tumbleweed1;
		gameBoard[bullStampede.getLocation()] = bullStampede;

		gameBoard[cactus1.getLocation()] = cactus1;
		gameBoard[cactus2.getLocation()] = cactus2;

		gameBoard[outlaw.getLocation()] = outlaw;
		gameBoard[sheriffSniper.getLocation()] = sheriffSniper;

		gameBoard[goldNugget1.getLocation()] = goldNugget1;
		gameBoard[goldNugget2.getLocation()] = goldNugget2;

		gameBoard[saloonDoor.getLocation()] = saloonDoor;


		movingPieces.add(tumbleweed1);
		movingPieces.add(bullStampede);
		movingPieces.add(outlaw);

		interactingPieces.add(goldNugget1);
		interactingPieces.add(goldNugget2);
		interactingPieces.add(outlaw);
		interactingPieces.add(sheriffSniper);
		interactingPieces.add(bullStampede);

		interactingPieces.add(saloonDoor);
	}
}


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
	
	private void level1() {
		board = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<>(); 
		interactingPieces = new ArrayList<>();
		
		playerStartLoc = 0;
		
		}
	
	}


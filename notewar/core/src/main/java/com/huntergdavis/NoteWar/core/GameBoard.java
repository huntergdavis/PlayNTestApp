/*
 * GameBoard.java, implements game board class
 *  
 * Base has no knowledge of other bases internally
 * Base is simple abstraction
 * Meant to be easily contained in LL or array etc 	
 * 
 */
package com.huntergdavis.NoteWar.core;
 
import java.util.Random; 
 
class GameBoard{
	
	// array of integers to hold our game board
	// game board defaults to 200x100 size for now
	// we assume for now there are 4 main terrain types
	protected int[][] boardArray;
	
	// our dimensions
	protected int xSize = 200;
	protected int ySize = 100;
	
	GameBoard() {
		Defaults();
	}
	
	/*
	 * Set the default game board options
	 */
	protected void Defaults() {
		xSize = 200;
		ySize = 100;
		boardArray = new int[xSize][ySize];
	};
	
	/*
	 * randomly place items on the game board
	 * defaults to 15 random items
	 */
	protected void RandomizeGameBoard() {
		placeXRandomObstacles(15);
	}
	
	/*
	 * randomly places obstacles on the game board
	 */
	protected void placeXRandomObstacles(int numberOfObstacles) {
		Random randomGenerator = new Random();
		for(int i = 0;i<numberOfObstacles;i++) {
			boardArray[randomGenerator.nextInt(xSize)][randomGenerator.nextInt(ySize)] = randomGenerator.nextInt(4);
		}
	}
}

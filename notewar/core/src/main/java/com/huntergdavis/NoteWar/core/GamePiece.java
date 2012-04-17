/*
 * GamePiece.java, implements GamePiece class
 *  
 * GamePiece has no knowledge of other gamePieces internally
 * GamePiece is simple abstraction
 * Meant to be easily contained in LL or array etc 	
 * 
 */
package com.huntergdavis.NoteWar.core;
 
class GamePiece {
	
	// gamePiece position defaults to 0,0 
	protected int xPosition;
	protected int yPosition;
	
	// gamePiece health defaults to 100
	protected int healthTotal;
	protected int healthCurrent;
	
	// current animation frame
	// animation frames are 1-indexed
	// because artists are not programmers
	protected int currentAnimationFrame;
	protected int totalNumberOfAnimationFrames;
	
	// is it highlighted?
	protected int highlightedState;
	
	// what type of piece is this?
	protected int gamePieceType;
	
	/*
	 * GamePiece initialization
	 * set everything to defaults
	 * using defaults() function
	 */
	GamePiece() {
		Defaults();
	}
	
	protected void Defaults() {
		xPosition = 0;
		yPosition = 0;
		healthTotal = 100;
		healthCurrent = 100;
		currentAnimationFrame = 1;
		totalNumberOfAnimationFrames = 1;
		highlightedState = 0;
	}
	
	/*
	 * Public Functions Available to other classes
	 * 
	 */
	 
	 /*
	  * set whether the unit is highlighted
	  * an int is used rather than a boolean
	  * so we may add more highlighted states later
	  */
	  public void setHighlight(int highlighted) {
		  highlightedState = highlighted;
	  }
	 
	 
	 /*
	  * update position
	  */
	 public void setPosition(int posX, int posY) {
		xPosition = posX;
		yPosition = posY;
	 }
	 
	 /*
	  * update health
	  */
	 public void setCurrentHealth(int currentHealth) {
		 healthCurrent = currentHealth;
	 }
	 
	 /*
	  * update health and total
	  */
	 public void setCurrentAndMaxHealth(int currentHealth, int maxHealth) {
		 healthCurrent = currentHealth;
		 healthTotal = maxHealth;
	 }
}

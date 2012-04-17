/*
 * GamePiece.java, implements GamePiece class
 *  
 * GamePiece has no knowledge of other gamePieces internally
 * GamePiece is simple abstraction
 * Meant to be easily contained in LL or array etc 	
 * 
 */
public class GamePiece {
	
	// gamePiece position defaults to 0,0 
	private int xPosition;
	private int yPosition;
	
	// gamePiece health defaults to 100
	private int healthTotal;
	private int healthCurrent;
	
	// current animation frame
	// animation frames are 1-indexed
	// because artists are not programmers
	private int currentAnimationFrame;
	private int totalNumberOfAnimationFrames;
	
	// is it highlighted?
	private int highlightedState;
	
	// what type of piece is this?
	private int gamePieceType;
	
	/*
	 * GamePiece initialization
	 * set everything to defaults
	 * using defaults() function
	 */
	abstract GamePiece() {
		Defaults();
	}
	
	private Defaults() {
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
	  public setHighlight(int highlighted) {
		  highlightedState = highlighted;
	  }
	 
	 
	 /*
	  * update position
	  */
	 public setPosition(int posX, int posY) {
		xPosition = posX;
		yPosition = posY;
	 }
	 
	 /*
	  * update health
	  */
	 public setCurrentHealth(int currentHealth) {
		 healthCurrent = currentHealth;
	 }
	 
	 /*
	  * update health and total
	  */
	 public setCurrentAndMaxHealth(int currentHealth, int maxHealth) {
		 healthCurrent = currentHealth;
		 healthTotal maxHealth;
	 }
}

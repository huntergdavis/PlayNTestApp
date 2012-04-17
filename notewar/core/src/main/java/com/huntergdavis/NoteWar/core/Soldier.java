/*
 * Soldier.java, implements Soldier class
 *  
 * Soldier has no knowledge of other soldiers internally
 * Soldier is simple abstraction
 * Meant to be easily contained in LL or array etc 	
 * 
 */
public class Soldier {
	
	// soldier position defaults to 0,0 
	private int xPosition;
	private int yPosition;
	
	// soldier health defaults to 100
	private int healthTotal;
	private int healthCurrent;
	
	// current animation frame
	// animation frames are 1-indexed
	// because artists are not programmers
	private int currentAnimationFrame;
	private int totalNumberOfAnimationFrames;
	
	/*
	 * Soldier initialization
	 * set everything to defaults
	 * using defaults() function
	 */
	Soldier() {
		Defaults();
	}
 
	Soldier(int posX, int posY) {
		Defaults();
		xPosition = posX;
		yPosition = posY;
	}

	Soldier(int posX, int posY, int health) {
		Defaults();
		xPosition = posX;
		yPosition = posY;
		healthCurrent = health;
		healthTotal = health;
	}
	
	private Defaults() {
		xPosition = 0;
		yPosition = 0;
		healthTotal = 100;
		healthCurrent = 100;
		currentAnimationFrame = 1;
		totalNumberOfAnimationFrames = 1;
	}
	
	/*
	 * Public Functions Available to other classes
	 * 
	 */
	 
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

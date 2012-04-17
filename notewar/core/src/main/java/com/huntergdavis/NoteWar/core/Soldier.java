/*
 * Soldier.java, implements soldier unit class
 *  
 * Soldier has no knowledge of other soldiers internally
 * Soldier is simple abstraction
 * Meant to be easily contained in LL or array etc 	
 * 
 */
package com.huntergdavis.NoteWar.core;
 
class Soldier extends GamePiece{
	
	/*
	 * set the game piece type
	 */
	Soldier() {
		Defaults();
		gamePieceType = 2;
	}
}

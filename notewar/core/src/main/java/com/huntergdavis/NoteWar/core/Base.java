/*
 * Base.java, implements homebase class
 *  
 * Base has no knowledge of other bases internally
 * Base is simple abstraction
 * Meant to be easily contained in LL or array etc 	
 * 
 */
package com.huntergdavis.NoteWar.core;
 
class Base extends GamePiece{
	
	/*
	 * set the game piece type
	 */
	Base() {
		Defaults();
		gamePieceType = 1;
	}
}

/*
 * WindowProperties.java, implements a container for 
 * user set graphics window properties
 *  
 * 
 */
package com.huntergdavis.NoteWar.core;
 
import java.util.Random; 
 
class WindowProperties{
	
	// our dimensions
	public int xSize;
	public int ySize;
	
	
	// default constructor
	WindowProperties() {
		Defaults();
	}
	
	/*
	 * Set the default game board options
	 */
	protected void Defaults() {
		xSize = 800;
		ySize = 400;
	};
}

/*
 * WindowProperties.java, implements a container for 
 * user set graphics window properties
 *  
 */
package com.huntergdavis.NoteWar.core;

import static playn.core.PlayN.*;
 
import playn.core.Game;
import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.GroupLayer;
 
class TileEngine{
	
	// our dimensions
	public int xSize;
	public int ySize;
	protected Image tileImages[];
	public int numberOfTiles = 5;
	
	
	// default constructor
	TileEngine() {
		Defaults();
	}
	
	/*
	 * Set the default game board options
	 */
	protected void Defaults() {
		// load in textures and return tiles
		tileImages = new Image[numberOfTiles];
	};
	
	public void setupGameBoardTilesAndLayer(GameBoard gameBoard, WindowProperties windowProperties) {
	    loadBoardTextures(windowProperties, gameBoard);
    
		// load gameboard layer
		loadGameBoardLayer(gameBoard, windowProperties);
	}
  
  /*
   * creates the game board from the layout and tileset given
   * loads them in as a graphics layer
   */
  private void loadGameBoardLayer(GameBoard gameBoard, WindowProperties windowProperties) {
	  
	  // calculate our x and y height for each tile
	  int tileWidth = windowProperties.xSize / gameBoard.xSize;
	  int tileHeight = windowProperties.ySize / gameBoard.ySize;
	  
	  // all these tiles go in one grouplayer
	  GroupLayer tileGroupLayer = graphics().createGroupLayer();
	  
	  // loop over each of the gameboard tiles and place them
	  // as image layers.
	  for(int wide=0; wide < gameBoard.xSize; wide++) {
	  
		// loop over each Y row tile in this outer x row
		for(int tall = 0; tall < gameBoard.ySize; tall++) {
			ImageLayer tileLayer = graphics().createImageLayer(tileImages[gameBoard.boardArray[wide][tall]]);
			tileLayer.setTranslation(wide*tileWidth,tall*tileHeight);
			tileGroupLayer.add(tileLayer);
		}
	  }
	  
	  // add the group layer to the main layer
	  graphics().rootLayer().add(tileGroupLayer);
  }
  
  /*
   * load in tile textures and other board related textures
   * this could be weather etc in the future?
   */
  private void loadBoardTextures(WindowProperties windowProperties, GameBoard gameBoard) {
	// load in the tiles for the gameboard
    loadAndScaleTileTextures(windowProperties, gameBoard);
  }
  
  /*
   * load in textures for the default tileset
   */
  private void loadAndScaleTileTextures(WindowProperties windowProperties, GameBoard gameBoard) {
	  
	  // calculate our x and y height for each tile
	  int tileWidth = windowProperties.xSize / gameBoard.xSize;

	  // we don't currently pre-scale the textures
	  // grab the grass (main background)
	  tileImages[0] = assets().getImage("tiles_" + tileWidth + "/grass.png");
	  tileImages[1] = assets().getImage("tiles_" + tileWidth + "/desert.png");
	  tileImages[2] = assets().getImage("tiles_" + tileWidth + "/bush.png");
	  tileImages[3] = assets().getImage("tiles_" + tileWidth + "/ocean.png");
	  tileImages[4] = assets().getImage("tiles_" + tileWidth + "/mountain.png");
  }	
	
}

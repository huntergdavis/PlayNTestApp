package com.huntergdavis.NoteWar.core;

import static playn.core.PlayN.*;

import playn.core.Game;
import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.GroupLayer;


public class NoteWar implements Game {	
	
  @Override
  public void init() {
	 
	// load in our user set window properties
	WindowProperties gameWindowProperties = new WindowProperties(); 
	
	// set our root layer properties
	graphics().setSize(gameWindowProperties.xSize,gameWindowProperties.ySize);
	 
	// load in background and root layer
	loadBackground(gameWindowProperties);

    // setup a new gameboard 
    GameBoard levelOne = setupGameBoard();
    
    // setup our tile engine
    TileEngine tileEngine = new TileEngine();
    
    // load the tile textures and board
    tileEngine.setupGameBoardTilesAndLayer(levelOne, gameWindowProperties);
    
    // load units
    loadUnits();
  }

  @Override
  public void paint(float alpha) {
    // the background automatically paints itself, so no need to do anything here!
  }

  @Override
  public void update(float delta) {
  }

  /*
   * required function
   * returns the update rate
   */
  @Override
  public int updateRate() {
    return 25;
  }
  
  // Private Functions
  
  // graphics related functions
  
  /*
   * creates a background image
   * loads it into a background layer
   * adds it to the root layer
   */
  private void loadBackground(WindowProperties windowProperties) {
    // create and add background image layer
    Image bgImage = assets().getImage("images/bg.png");
    ImageLayer bgLayer = graphics().createImageLayer(bgImage);
    graphics().rootLayer().add(bgLayer);
  }
  
  // game related functions
  
  /*
   * setup a random game board
   */
  private GameBoard setupGameBoard() {
    // set a new gameboard
    return new GameBoard(40);
  }
  
  /*
   * load in some units
   */
  private void loadUnits() {
    // create 1000 soliders
    Soldier units[] = new Soldier[1000];
    for(int i =0;i<1000;i++) {
		units[i] = new Soldier();
	}
    units[233].setPosition(3,5);
  }

}

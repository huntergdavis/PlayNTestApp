package com.huntergdavis.NoteWar.core;

import static playn.core.PlayN.*;

import playn.core.Game;
import playn.core.Image;
import playn.core.ImageLayer;


public class NoteWar implements Game {
  @Override
  public void init() {
	  
	// load in background and root layer
	loadBackground();

	// load in textures
	loadTextures();
    
    // setup a new gameboard 
    setupGameBoard();
    
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

  @Override
  public int updateRate() {
    return 25;
  }
  
  private void setupGameBoard() {
    // set a new gameboard
    GameBoard levelOne = new GameBoard();
  }
  
  private void loadBackground() {
    // create and add background image layer
    Image bgImage = assets().getImage("images/bg.png");
    ImageLayer bgLayer = graphics().createImageLayer(bgImage);
    graphics().rootLayer().add(bgLayer);
  }
  
  private void loadTextures() {
	// load in the tiles for the gameboard
    Image tileImages[] = new Image[5];
    loadTileTextures(tileImages);
  }
  
  private void loadTileTextures(Image tileContainer[]) {
	tileContainer[0] = assets().getImage("tiles_4096/bush.png");
	tileContainer[1] = assets().getImage("tiles_4096/desert.png");
	tileContainer[2] = assets().getImage("tiles_4096/grass.png");
	tileContainer[3] = assets().getImage("tiles_4096/ocean.png");
	tileContainer[4] = assets().getImage("tiles_4096/mountain.png");
  }
  
  private void loadUnits() {
    // create 1000 soliders
    Soldier units[] = new Soldier[1000];
    for(int i =0;i<1000;i++) {
		units[i] = new Soldier();
	}
    units[233].setPosition(3,5);
  }

}

package com.huntergdavis.NoteWar.core;

import static playn.core.PlayN.*;

import playn.core.Game;
import playn.core.Image;
import playn.core.ImageLayer;


public class NoteWar implements Game {
  @Override
  public void init() {
    // create and add background image layer
    Image bgImage = assets().getImage("images/bg.png");
    ImageLayer bgLayer = graphics().createImageLayer(bgImage);
    graphics().rootLayer().add(bgLayer);
    
    // create 1000 soliders
    Soldier units[] = new Soldier[1000];
    for(int i =0;i<1000;i++) {
		units[i] = new Soldier();
	}
    units[233].setPosition(3,5);
    
    // set a new gameboard
    GameBoard levelOne = new GameBoard();
    
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
}

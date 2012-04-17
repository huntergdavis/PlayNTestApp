package com.huntergdavis.NoteWar.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.huntergdavis.NoteWar.core.NoteWar;

public class NoteWarActivity extends GameActivity {

  @Override
  public void main(){
    platform().assets().setPathPrefix("com/huntergdavis/NoteWar/resources");
    PlayN.run(new NoteWar());
  }
}

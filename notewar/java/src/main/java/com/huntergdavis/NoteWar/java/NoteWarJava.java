package com.huntergdavis.NoteWar.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.huntergdavis.NoteWar.core.NoteWar;

public class NoteWarJava {

  public static void main(String[] args) {
    JavaPlatform platform = JavaPlatform.register();
    platform.assets().setPathPrefix("com/huntergdavis/NoteWar/resources");
    PlayN.run(new NoteWar());
  }
}
